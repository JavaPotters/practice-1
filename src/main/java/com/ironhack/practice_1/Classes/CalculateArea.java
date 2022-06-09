package com.ironhack.practice_1.Classes;

import com.ironhack.practice_1.Enumerations.ShapeType;

public class CalculateArea {

    public static double calculateArea (ShapeType shapeType, double... parameters ) throws RuntimeException{
        double shapeArea = 0;
        if (parameters.length == 0) {
            throw new RuntimeException("Es necesario que añada algún parámetro");
        } else if (parameters[0] < 0) {
            throw new IllegalArgumentException("El número es negativo");
        }

        switch (shapeType) {
            case RECTANGLE:
                if (parameters[1] < 0) {
                    throw new IllegalArgumentException("El número es negativo");
                }
                shapeArea = parameters[0]*parameters[1];
                break;
            case SQUARE:
                shapeArea = parameters[0]*parameters[0];
                break;
            case CIRCLE:
                shapeArea = Math.pow(parameters[0], 2)*Math.PI;
                break;
        }
        return Math.round(shapeArea*100.0)/100.0;
    }

}
