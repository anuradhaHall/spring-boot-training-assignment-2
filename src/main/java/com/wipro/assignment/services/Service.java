package com.wipro.assignment.services;

import com.wipro.assignment.models.*;

public class Service {

    public enum validShape{square, rectangle, circle};

    public Shape getShape(validShape shape, double length, double width, double radius){

        if(shape.equals(validShape.square)){
            Square square = new Square();
            square.setLength(length);
            return square;
        }

        else if(shape.equals(validShape.rectangle)){
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(length);
            rectangle.setWidth(width);
            return rectangle;
        }

        else if(shape.equals(validShape.circle)){
            Circle circle = new Circle();
            circle.setRadius(radius);
            return circle;
        }

        return null;
    }
}
