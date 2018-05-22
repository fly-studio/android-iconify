package com.fly.iconify.fontawesome.module;

import com.fly.iconify.Icon;
import com.fly.iconify.IconFontDescriptor;
import com.fly.iconify.fontawesome.icons.FontAwesomeRegularIcons;

public class FontAwesomeRegularModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "fonts/fa-regular-400.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeRegularIcons.values();
    }
}
