package com.wipro.assignment.models;

public class Rectangle implements Shape{

    private double length;
    private double width;

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea(double length, double width, double radius) {
        return (length * width);
    }

    @Override
    public double getPerimeter(double length, double width, double radius) {
        return (length + width + length + width);
    }
    
}
