package com.akhil.structural.flyweight;

public class PointIcon {

    private final PointType pointType; // 4 Bytes
    private final byte[] icon; // Assume each icon takes 20KB

    public PointIcon(PointType pointType, byte[] icon) {
        this.pointType = pointType;
        this.icon = icon;
    }

    public PointType getPointType() {
        return pointType;
    }
}
