package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPException;

public class ParseState {
    public int pos = 0;
    public String str;

    public ParseState(String str2) {
        this.str = str2;
    }

    /* renamed from: ch */
    public char mo3122ch() {
        if (this.pos < this.str.length()) {
            return this.str.charAt(this.pos);
        }
        return 0;
    }

    /* renamed from: ch */
    public char mo3123ch(int i) {
        if (i < this.str.length()) {
            return this.str.charAt(i);
        }
        return 0;
    }

    public int gatherInt(String str2, int i) {
        char ch = mo3123ch(this.pos);
        int i2 = 0;
        boolean z = false;
        while ('0' <= ch && ch <= '9') {
            i2 = (i2 * 10) + (ch - '0');
            this.pos++;
            ch = mo3123ch(this.pos);
            z = true;
        }
        if (!z) {
            throw new XMPException(str2, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    public boolean hasNext() {
        return this.pos < this.str.length();
    }

    public int length() {
        return this.str.length();
    }

    public int pos() {
        return this.pos;
    }

    public void skip() {
        this.pos++;
    }
}