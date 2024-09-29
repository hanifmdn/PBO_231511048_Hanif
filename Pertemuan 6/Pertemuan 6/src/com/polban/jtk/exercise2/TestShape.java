package com.polban.jtk.exercise2;

import org.w3c.dom.css.Rect;

public class TestShape {
    public static void main (String[] args) {
        // test shape
        System.out.println("------------------------------------------\nSHAPE");
        Shape sNoParameter = new Shape();
        System.out.println("\nTanpa Parameter:");
        System.out.println(sNoParameter.toString());

        System.out.println("\nDengan parameter Blue dan False:");
        Shape sParameter = new Shape("Blue", false);
        System.out.println(sParameter.toString());

        System.out.println("\nDengan parameter Red dan True:");
        Shape sParameter2 = new Shape("Red", true);
        System.out.println(sParameter2.toString());


        System.out.println("----------------------------------------\nCIRCLE");
        // test circle
        Circle c1 = new Circle();
        System.out.println("\nCircle tanpa parameter\n" + c1.toString());

        Circle cWithParameter = new Circle(10, "Red", true);
        System.out.println("\nCircle dengan parameter:\n" + cWithParameter.toString());
        System.out.println("Area: " + cWithParameter.getArea());
        System.out.println("Perimeter: " + cWithParameter.getPerimeter());


        System.out.println("----------------------------------------\nRECTANGLE");
        // test rect
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());

        Rectangle rWithParemeter = new Rectangle(5, 10, "Blue", false);
        System.out.println(rWithParemeter.toString());
        System.out.println("Area: " + rWithParemeter.getArea());
        System.out.println("Perimeter: " + rWithParemeter.getPerimeter());


        System.out.println("----------------------------------------\nSQUARE");
        Square s1 = new Square(10);
        System.out.println(s1.toString());
        s1.setLength(4.0);
        System.out.println("New Length: " + s1.getLength());
        System.out.println(s1.toString());






    }
}
