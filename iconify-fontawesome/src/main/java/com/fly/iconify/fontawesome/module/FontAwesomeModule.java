package com.fly.iconify.fontawesome.module;

import com.fly.iconify.Icon;
import com.fly.iconify.IconFontDescriptor;
import com.fly.iconify.fontawesome.icons.FontAwesomeIcons;

public class FontAwesomeModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "fonts/fa-solid-900.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeIcons.values();
    }
}