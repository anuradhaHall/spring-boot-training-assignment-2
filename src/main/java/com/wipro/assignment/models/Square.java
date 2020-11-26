package com.wipro.assignment.models;

public class Square implements Shape{

    private double length;
    
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(double length, double width, double radius) {
        return (length * length);
    }

    @Override
    public double getPerimeter(double length, double width, double radius) {
        return (length * 4);
    }
    
}
