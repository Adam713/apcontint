package com.itextpdf.xmp.impl;

import com.itextpdf.text.xml.xmp.DublinCoreProperties;
import com.itextpdf.text.xml.xmp.DublinCoreSchema;
import com.itextpdf.xmp.XMPConst;
import com.itextpdf.xmp.XMPDateTime;
import com.itextpdf.xmp.XMPError;
import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;
import com.itextpdf.xmp.XMPMetaFactory;
import com.itextpdf.xmp.XMPUtils;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.options.ParseOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPAliasInfo;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class XMPNormalizer {
    public static Map dcArrayForms;

    static {
        initDCArrays();
    }

    public static void compareAliasedSubtrees(XMPNode xMPNode, XMPNode xMPNode2, boolean z) {
        String str = "Mismatch between alias and base nodes";
        if (!xMPNode.getValue().equals(xMPNode2.getValue()) || xMPNode.getChildrenLength() != xMPNode2.getChildrenLength()) {
            throw new XMPException(str, XMPError.BADXMP);
        } else if (z || (xMPNode.getName().equals(xMPNode2.getName()) && xMPNode.getOptions().equals(xMPNode2.getOptions()) && xMPNode.getQualifierLength() == xMPNode2.getQualifierLength())) {
            Iterator iterateChildren = xMPNode.iterateChildren();
            Iterator iterateChildren2 = xMPNode2.iterateChildren();
            while (iterateChildren.hasNext() && iterateChildren2.hasNext()) {
                compareAliasedSubtrees((XMPNode) iterateChildren.next(), (XMPNode) iterateChildren2.next(), false);
            }
            Iterator iterateQualifier = xMPNode.iterateQualifier();
            Iterator iterateQualifier2 = xMPNode2.iterateQualifier();
            while (iterateQualifier.hasNext() && iterateQualifier2.hasNext()) {
                compareAliasedSubtrees((XMPNode) iterateQualifier.next(), (XMPNode) iterateQualifier2.next(), false);
            }
        } else {
            throw new XMPException(str, XMPError.BADXMP);
        }
    }

    public static void deleteEmptySchemas(XMPNode xMPNode) {
        Iterator iterateChildren = xMPNode.iterateChildren();
        while (iterateChildren.hasNext()) {
            if (!((XMPNode) iterateChildren.next()).hasChildren()) {
                iterateChildren.remove();
            }
        }
    }

    public static void fixGPSTimeStamp(XMPNode xMPNode) {
        XMPNode findChildNode = XMPNodeUtils.findChildNode(xMPNode, "exif:GPSTimeStamp", false);
        if (findChildNode != null) {
            try {
                XMPDateTime convertToDate = XMPUtils.convertToDate(findChildNode.getValue());
                if (convertToDate.getYear() == 0 && convertToDate.getMonth() == 0) {
                    if (convertToDate.getDay() == 0) {
                        XMPNode findChildNode2 = XMPNodeUtils.findChildNode(xMPNode, "exif:DateTimeOriginal", false);
                        if (findChildNode2 == null) {
                            findChildNode2 = XMPNodeUtils.findChildNode(xMPNode, "exif:DateTimeDigitized", false);
                        }
                        XMPDateTime convertToDate2 = XMPUtils.convertToDate(findChildNode2.getValue());
                        Calendar calendar = convertToDate.getCalendar();
                        calendar.set(1, convertToDate2.getYear());
                        calendar.set(2, convertToDate2.getMonth());
                        calendar.set(5, convertToDate2.getDay());
                        findChildNode.setValue(XMPUtils.convertFromDate(new XMPDateTimeImpl(calendar)));
                    }
                }
            } catch (XMPException unused) {
            }
        }
    }

    public static void initDCArrays() {
        dcArrayForms = new HashMap();
        PropertyOptions propertyOptions = new PropertyOptions();
        propertyOptions.setArray(true);
        dcArrayForms.put(DublinCoreSchema.CONTRIBUTOR, propertyOptions);
        dcArrayForms.put(DublinCoreSchema.LANGUAGE, propertyOptions);
        dcArrayForms.put(DublinCoreSchema.PUBLISHER, propertyOptions);
        dcArrayForms.put(DublinCoreSchema.RELATION, propertyOptions);
        dcArrayForms.put(DublinCoreSchema.SUBJECT, propertyOptions);
        dcArrayForms.put(DublinCoreSchema.TYPE, propertyOptions);
        PropertyOptions propertyOptions2 = new PropertyOptions();
        propertyOptions2.setArray(true);
        propertyOptions2.setArrayOrdered(true);
        dcArrayForms.put(DublinCoreSchema.CREATOR, propertyOptions2);
        dcArrayForms.put(DublinCoreSchema.DATE, propertyOptions2);
        PropertyOptions propertyOptions3 = new PropertyOptions();
        propertyOptions3.setArray(true);
        propertyOptions3.setArrayOrdered(true);
        propertyOptions3.setArrayAlternate(true);
        propertyOptions3.setArrayAltText(true);
        dcArrayForms.put(DublinCoreSchema.DESCRIPTION, propertyOptions3);
        dcArrayForms.put(DublinCoreSchema.RIGHTS, propertyOptions3);
        dcArrayForms.put(DublinCoreSchema.TITLE, propertyOptions3);
    }

    public static void migrateAudioCopyright(XMPMeta xMPMeta, XMPNode xMPNode) {
        String sb;
        String str = "x-default";
        try {
            XMPNode findSchemaNode = XMPNodeUtils.findSchemaNode(((XMPMetaImpl) xMPMeta).getRoot(), "http://purl.org/dc/elements/1.1/", true);
            String value = xMPNode.getValue();
            String str2 = "\n\n";
            XMPNode findChildNode = XMPNodeUtils.findChildNode(findSchemaNode, DublinCoreSchema.RIGHTS, false);
            if (findChildNode != null) {
                if (findChildNode.hasChildren()) {
                    int lookupLanguageItem = XMPNodeUtils.lookupLanguageItem(findChildNode, str);
                    if (lookupLanguageItem < 0) {
                        XMPMeta xMPMeta2 = xMPMeta;
                        xMPMeta2.setLocalizedText("http://purl.org/dc/elements/1.1/", DublinCoreProperties.RIGHTS, "", "x-default", findChildNode.getChild(1).getValue(), null);
                        lookupLanguageItem = XMPNodeUtils.lookupLanguageItem(findChildNode, str);
                    }
                    XMPNode child = findChildNode.getChild(lookupLanguageItem);
                    String value2 = child.getValue();
                    int indexOf = value2.indexOf(str2);
                    if (indexOf < 0) {
                        if (!value.equals(value2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(value2);
                            sb2.append(str2);
                            sb2.append(value);
                            sb = sb2.toString();
                        }
                        xMPNode.getParent().removeChild(xMPNode);
                    }
                    int i = indexOf + 2;
                    if (!value2.substring(i).equals(value)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(value2.substring(0, i));
                        sb3.append(value);
                        sb = sb3.toString();
                    }
                    xMPNode.getParent().removeChild(xMPNode);
                    child.setValue(sb);
                    xMPNode.getParent().removeChild(xMPNode);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(value);
            XMPMeta xMPMeta3 = xMPMeta;
            xMPMeta3.setLocalizedText("http://purl.org/dc/elements/1.1/", DublinCoreProperties.RIGHTS, "", "x-default", sb4.toString(), null);
            xMPNode.getParent().removeChild(xMPNode);
        } catch (XMPException unused) {
        }
    }

    public static void moveExplicitAliases(XMPNode xMPNode, ParseOptions parseOptions) {
        if (xMPNode.getHasAliases()) {
            xMPNode.setHasAliases(false);
            boolean strictAliasing = parseOptions.getStrictAliasing();
            for (XMPNode xMPNode2 : xMPNode.getUnmodifiableChildren()) {
                if (xMPNode2.getHasAliases()) {
                    Iterator iterateChildren = xMPNode2.iterateChildren();
                    while (iterateChildren.hasNext()) {
                        XMPNode xMPNode3 = (XMPNode) iterateChildren.next();
                        if (xMPNode3.isAlias()) {
                            xMPNode3.setAlias(false);
                            XMPAliasInfo findAlias = XMPMetaFactory.getSchemaRegistry().findAlias(xMPNode3.getName());
                            if (findAlias != null) {
                                XMPNode xMPNode4 = null;
                                XMPNode findSchemaNode = XMPNodeUtils.findSchemaNode(xMPNode, findAlias.getNamespace(), null, true);
                                findSchemaNode.setImplicit(false);
                                StringBuilder sb = new StringBuilder();
                                sb.append(findAlias.getPrefix());
                                sb.append(findAlias.getPropName());
                                XMPNode findChildNode = XMPNodeUtils.findChildNode(findSchemaNode, sb.toString(), false);
                                if (findChildNode == null) {
                                    if (findAlias.getAliasForm().isSimple()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(findAlias.getPrefix());
                                        sb2.append(findAlias.getPropName());
                                        xMPNode3.setName(sb2.toString());
                                        findSchemaNode.addChild(xMPNode3);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(findAlias.getPrefix());
                                        sb3.append(findAlias.getPropName());
                                        XMPNode xMPNode5 = new XMPNode(sb3.toString(), findAlias.getAliasForm().toPropertyOptions());
                                        findSchemaNode.addChild(xMPNode5);
                                        transplantArrayItemAlias(iterateChildren, xMPNode3, xMPNode5);
                                    }
                                } else if (!findAlias.getAliasForm().isSimple()) {
                                    if (findAlias.getAliasForm().isArrayAltText()) {
                                        int lookupLanguageItem = XMPNodeUtils.lookupLanguageItem(findChildNode, "x-default");
                                        if (lookupLanguageItem != -1) {
                                            xMPNode4 = findChildNode.getChild(lookupLanguageItem);
                                        }
                                    } else if (findChildNode.hasChildren()) {
                                        xMPNode4 = findChildNode.getChild(1);
                                    }
                                    if (xMPNode4 == null) {
                                        transplantArrayItemAlias(iterateChildren, xMPNode3, findChildNode);
                                    } else if (strictAliasing) {
                                        compareAliasedSubtrees(xMPNode3, xMPNode4, true);
                                    }
                                } else if (strictAliasing) {
                                    compareAliasedSubtrees(xMPNode3, findChildNode, true);
                                }
                                iterateChildren.remove();
                            }
                        }
                    }
                    xMPNode2.setHasAliases(false);
                }
            }
        }
    }

    public static void normalizeDCArrays(XMPNode xMPNode) {
        for (int i = 1; i <= xMPNode.getChildrenLength(); i++) {
            XMPNode child = xMPNode.getChild(i);
            PropertyOptions propertyOptions = (PropertyOptions) dcArrayForms.get(child.getName());
            if (propertyOptions != null) {
                if (child.getOptions().isSimple()) {
                    XMPNode xMPNode2 = new XMPNode(child.getName(), propertyOptions);
                    child.setName(XMPConst.ARRAY_ITEM_NAME);
                    xMPNode2.addChild(child);
                    xMPNode.replaceChild(i, xMPNode2);
                    if (propertyOptions.isArrayAltText() && !child.getOptions().getHasLanguage()) {
                        child.addQualifier(new XMPNode(XMPConst.XML_LANG, "x-default", null));
                    }
                } else {
                    child.getOptions().setOption(7680, false);
                    child.getOptions().mergeWith(propertyOptions);
                    if (propertyOptions.isArrayAltText()) {
                        repairAltText(child);
                    }
                }
            }
        }
    }

    public static XMPMeta process(XMPMetaImpl xMPMetaImpl, ParseOptions parseOptions) {
        XMPNode root = xMPMetaImpl.getRoot();
        touchUpDataModel(xMPMetaImpl);
        moveExplicitAliases(root, parseOptions);
        tweakOldXMP(root);
        deleteEmptySchemas(root);
        return xMPMetaImpl;
    }

    public static void repairAltText(XMPNode xMPNode) {
        if (xMPNode != null && xMPNode.getOptions().isArray()) {
            xMPNode.getOptions().setArrayOrdered(true).setArrayAlternate(true).setArrayAltText(true);
            Iterator iterateChildren = xMPNode.iterateChildren();
            while (iterateChildren.hasNext()) {
                XMPNode xMPNode2 = (XMPNode) iterateChildren.next();
                if (!xMPNode2.getOptions().isCompositeProperty()) {
                    if (!xMPNode2.getOptions().getHasLanguage()) {
                        String value = xMPNode2.getValue();
                        if (!(value == null || value.length() == 0)) {
                            xMPNode2.addQualifier(new XMPNode(XMPConst.XML_LANG, "x-repair", null));
                        }
                    }
                }
                iterateChildren.remove();
            }
        }
    }

    public static void touchUpDataModel(XMPMetaImpl xMPMetaImpl) {
        XMPNode findChildNode;
        String str = "http://purl.org/dc/elements/1.1/";
        XMPNodeUtils.findSchemaNode(xMPMetaImpl.getRoot(), str, true);
        Iterator iterateChildren = xMPMetaImpl.getRoot().iterateChildren();
        while (iterateChildren.hasNext()) {
            XMPNode xMPNode = (XMPNode) iterateChildren.next();
            if (str.equals(xMPNode.getName())) {
                normalizeDCArrays(xMPNode);
            } else {
                if (XMPConst.NS_EXIF.equals(xMPNode.getName())) {
                    fixGPSTimeStamp(xMPNode);
                    findChildNode = XMPNodeUtils.findChildNode(xMPNode, "exif:UserComment", false);
                    if (findChildNode == null) {
                    }
                } else {
                    if (XMPConst.NS_DM.equals(xMPNode.getName())) {
                        XMPNode findChildNode2 = XMPNodeUtils.findChildNode(xMPNode, "xmpDM:copyright", false);
                        if (findChildNode2 != null) {
                            migrateAudioCopyright(xMPMetaImpl, findChildNode2);
                        }
                    } else {
                        if (XMPConst.NS_XMP_RIGHTS.equals(xMPNode.getName())) {
                            findChildNode = XMPNodeUtils.findChildNode(xMPNode, "xmpRights:UsageTerms", false);
                            if (findChildNode == null) {
                            }
                        }
                    }
                }
                repairAltText(findChildNode);
            }
        }
    }

    public static void transplantArrayItemAlias(Iterator it, XMPNode xMPNode, XMPNode xMPNode2) {
        if (xMPNode2.getOptions().isArrayAltText()) {
            if (!xMPNode.getOptions().getHasLanguage()) {
                xMPNode.addQualifier(new XMPNode(XMPConst.XML_LANG, "x-default", null));
            } else {
                throw new XMPException("Alias to x-default already has a language qualifier", XMPError.BADXMP);
            }
        }
        it.remove();
        xMPNode.setName(XMPConst.ARRAY_ITEM_NAME);
        xMPNode2.addChild(xMPNode);
    }

    public static void tweakOldXMP(XMPNode xMPNode) {
        if (xMPNode.getName() != null && xMPNode.getName().length() >= 36) {
            String lowerCase = xMPNode.getName().toLowerCase();
            String str = "uuid:";
            if (lowerCase.startsWith(str)) {
                lowerCase = lowerCase.substring(5);
            }
            if (Utils.checkUUIDFormat(lowerCase)) {
                XMPNode findNode = XMPNodeUtils.findNode(xMPNode, XMPPathParser.expandXPath("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                if (findNode != null) {
                    findNode.setOptions(null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(lowerCase);
                    findNode.setValue(sb.toString());
                    findNode.removeChildren();
                    findNode.removeQualifiers();
                    xMPNode.setName(null);
                    return;
                }
                throw new XMPException("Failure creating xmpMM:InstanceID", 9);
            }
        }
    }
}
