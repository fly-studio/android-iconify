package com.fly.iconify.fontawesome.module;

import com.fly.iconify.Icon;
import com.fly.iconify.IconFontDescriptor;
import com.fly.iconify.fontawesome.icons.FontAwesomeLightIcons;

public class FontAwesomeLightModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "fonts/fa-light-300.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeLightIcons.values();
    }

}
