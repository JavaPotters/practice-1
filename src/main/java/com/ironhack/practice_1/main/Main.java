package com.ironhack.practice_1.main;

import com.ironhack.practice_1.Classes.CalculateArea;
import com.ironhack.practice_1.Enumerations.ShapeType;

public class Main {

    public static void main(String[] args) {
        System.out.println("Shape areas");

        System.out.println("The rectangle area is: " + CalculateArea.calculateArea(ShapeType.RECTANGLE, 10.0, 12.0));
        System.out.println("The square area is: " + CalculateArea.calculateArea(ShapeType.SQUARE, 10.0));
        System.out.println("The circle area is: " + CalculateArea.calculateArea(ShapeType.CIRCLE, 10.0));
    }

}
