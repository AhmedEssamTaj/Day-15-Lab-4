/*
Author: Ahmed Essam Taj
Date: 7, November
Day 15 - Lab 4

 */

public class Main {
    public static void main(String[] args) {

        // Testing the Circle class
        System.out.println("============= circle =============");
        Circle c = new Circle(5.5);
        System.out.println("circle radius is: " + c.getRadius());
        System.out.println("Change radius to 3.5");
        c.setRadius(3.5);
        System.out.println("circle radius after change is: " + c.getRadius());
        System.out.println("circle area is: " + c.calculateArea());
        System.out.println("circle circumference is: " + c.calculateCircumference());

        // Testing the Rectangle class
        System.out.println("============= rectangle =============");
        Rectangle r = new Rectangle(1.5, 2.5);
        System.out.println("rectangle height is: " + r.getHeight() + " and width is: " + r.getWidth());
        System.out.println("change rectangle height to 3.5 and width to 6.5 ");
        r.setHeight(3.5);
        System.out.println("rectangle height after change is: " + r.getHeight());
        r.setWidth(6.5);
        System.out.println("rectangle width after change is: " + r.getWidth());
        System.out.println("rectangle area is: " + r.calculateArea());
        System.out.println("rectangle circumference (perimeter) is: " + r.calculateCircumference());

        // Testing Triangle class
        System.out.println("============= triangle =============");
        Triangle t = new Triangle(1.5, 2.5);
        System.out.println("triangle height is: " + t.getHeight() + " and base is: " + t.getBase());
        System.out.println("change triangle height to 4.5 and base to 6.5 ");
        t.setHeight(4.5);
        t.setBase(6.5);
        System.out.println("triangle height after change is: " + t.getHeight());
        System.out.println("triangle base after change is: " + t.getBase());
        System.out.println("triangle area is: " + t.calculateArea());
        // Assume triangle is right sided (So we can calculate the third side using pythagoras theorem
        System.out.println("Assuming triangle is Right sided..");
        System.out.println("triangle circumference (perimeter) is: " + t.calculateCircumference());


    }
}