package com.wipro.assignment.controllers;

import com.wipro.assignment.models.*;
import com.wipro.assignment.services.Service;
import com.wipro.assignment.services.Service.validShape;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ShapeController {
    @GetMapping("/shape")
    public Response getShape(@RequestParam(value = "shape") validShape shape, 
    @RequestParam(value = "length", defaultValue = "0") double length, 
    @RequestParam(value = "width", defaultValue = "0") double width, 
    @RequestParam(value = "radius", defaultValue = "0") double radius){

        Service service = new Service();
        Shape chosenShape = service.getShape(shape, length, width, radius);

        Response response = new Response();
        response.setArea(chosenShape.getArea(length, width, radius));
        response.setPerimeter(chosenShape.getPerimeter(length, width, radius));
        
        return response;

    }    
    
   
}
