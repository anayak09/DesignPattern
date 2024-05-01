package com.akhil.creational.prototype;

public class Circle implements Component{
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering a Circle");
    }

    @Override
    public Component clone() {
        Circle target = new Circle();
        target.setRadius(this.radius);
        return target;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
