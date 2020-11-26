package com.wipro.assignment.models;

public class Circle implements Shape {

    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(double length, double width, double radius) {

        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter(double length, double width, double radius) {
        return (2 * Math.PI * radius);
    }
    
}
