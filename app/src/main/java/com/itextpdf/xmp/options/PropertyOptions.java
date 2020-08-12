package com.itextpdf.xmp.options;



import com.itextpdf.xmp.XMPException;

public final class PropertyOptions extends Options {
    public static final int ARRAY = 512;
    public static final int ARRAY_ALTERNATE = 2048;
    public static final int ARRAY_ALT_TEXT = 4096;
    public static final int ARRAY_ORDERED = 1024;
    public static final int DELETE_EXISTING = 536870912;
    public static final int HAS_LANGUAGE = 64;
    public static final int HAS_QUALIFIERS = 16;
    public static final int HAS_TYPE = 128;
    public static final int NO_OPTIONS = 0;
    public static final int QUALIFIER = 32;
    public static final int SCHEMA_NODE = Integer.MIN_VALUE;
    public static final int SEPARATE_NODE = 1073741824;
    public static final int STRUCT = 256;
    public static final int URI = 2;

    public PropertyOptions() {
    }

    public PropertyOptions(int i) {
        super(i);
    }

    public void assertConsistency(int i) {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new XMPException("Structs and arrays can't have \"value\" options", 103);
        }
    }

    public String defineOptionName(int i) {
        switch (i) {
            case Integer.MIN_VALUE:
                return "SCHEMA_NODE";
            case 2:
                return "URI";
            case 16:
                return "HAS_QUALIFIER";
            case 32:
                return "QUALIFIER";
            case 64:
                return "HAS_LANGUAGE";
            case 128:
                return "HAS_TYPE";
            case 256:
                return "STRUCT";
            case 512:
                return "ARRAY";
            case 1024:
                return "ARRAY_ORDERED";
            case 2048:
                return "ARRAY_ALTERNATE";
            case 4096:
                return "ARRAY_ALT_TEXT";
            default:
                return null;
        }
    }

    public boolean equalArrayTypes(PropertyOptions propertyOptions) {
        return isArray() == propertyOptions.isArray() && isArrayOrdered() == propertyOptions.isArrayOrdered() && isArrayAlternate() == propertyOptions.isArrayAlternate() && isArrayAltText() == propertyOptions.isArrayAltText();
    }

    public boolean getHasLanguage() {
        return getOption(64);
    }

    public boolean getHasQualifiers() {
        return getOption(16);
    }

    public boolean getHasType() {
        return getOption(128);
    }

    public int getValidOptions() {
        return -1073733646;
    }

    public boolean isArray() {
        return getOption(512);
    }

    public boolean isArrayAltText() {
        return getOption(4096);
    }

    public boolean isArrayAlternate() {
        return getOption(2048);
    }

    public boolean isArrayOrdered() {
        return getOption(1024);
    }

    public boolean isCompositeProperty() {
        return (getOptions() & 768) > 0;
    }

    public boolean isOnlyArrayOptions() {
        return (getOptions() & -7681) == 0;
    }

    public boolean isQualifier() {
        return getOption(32);
    }

    public boolean isSchemaNode() {
        return getOption(Integer.MIN_VALUE);
    }

    public boolean isSimple() {
        return (getOptions() & 768) == 0;
    }

    public boolean isStruct() {
        return getOption(256);
    }

    public boolean isURI() {
        return getOption(2);
    }

    public void mergeWith(PropertyOptions propertyOptions) {
        if (propertyOptions != null) {
            setOptions(propertyOptions.getOptions() | getOptions());
        }
    }

    public PropertyOptions setArray(boolean z) {
        setOption(512, z);
        return this;
    }

    public PropertyOptions setArrayAltText(boolean z) {
        setOption(4096, z);
        return this;
    }

    public PropertyOptions setArrayAlternate(boolean z) {
        setOption(2048, z);
        return this;
    }

    public PropertyOptions setArrayOrdered(boolean z) {
        setOption(1024, z);
        return this;
    }

    public PropertyOptions setHasLanguage(boolean z) {
        setOption(64, z);
        return this;
    }

    public PropertyOptions setHasQualifiers(boolean z) {
        setOption(16, z);
        return this;
    }

    public PropertyOptions setHasType(boolean z) {
        setOption(128, z);
        return this;
    }

    public PropertyOptions setQualifier(boolean z) {
        setOption(32, z);
        return this;
    }

    public PropertyOptions setSchemaNode(boolean z) {
        setOption(Integer.MIN_VALUE, z);
        return this;
    }

    public PropertyOptions setStruct(boolean z) {
        setOption(256, z);
        return this;
    }

    public PropertyOptions setURI(boolean z) {
        setOption(2, z);
        return this;
    }
}
