package com.fly.iconify.fontawesome.module;

import com.fly.iconify.Icon;
import com.fly.iconify.IconFontDescriptor;
import com.fly.iconify.fontawesome.icons.FontAwesomeBrandsIcons;

public class FontAwesomeBrandsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "fonts/fa-brands-400.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeBrandsIcons.values();
    }
}
