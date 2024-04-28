package com.akhil.structural.flyweight;

public class Point {
    private int x; // 4 Bytes
    private int y; // 4 Bytes
    private PointIcon pointIcon;

    // With Flyweight pattern, we can reduce the amount of memory our application takes.

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", pointIcon.getPointType() , x, y);
    }
}
