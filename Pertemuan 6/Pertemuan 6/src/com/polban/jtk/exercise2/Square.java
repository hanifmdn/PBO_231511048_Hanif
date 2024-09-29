package com.polban.jtk.exercise2;

public class Square extends Rectangle {

    public Square (double side) {
        super(side, side);
    }

    public Square (double side, String color, boolean filled) {
        super(side,side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide (double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth (double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength (double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() + " which is a subclass of " + super.toString();
    }

    // tidak perlu override getArea() dan getPerimeter() karena sama sama berlaku untuk persegi.
}
