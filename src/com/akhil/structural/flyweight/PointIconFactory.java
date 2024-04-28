package com.akhil.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    // Pool of PointIcon object (like a StringPool)
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        // key       -> value
        // PointType -> PointIcon
        if(!icons.containsKey(type)) {
            var icon = new PointIcon(type, null);
            // can get icons as a bytep[] stream from some files (cafe.jpg etc)
            icons.put(type, icon);
        }

        return icons.get(type);
    }
}
