package com.ironhack.practice_1.Classes;

import com.ironhack.practice_1.Enumerations.ShapeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {

    @Test
    void calculateArea_positiveValues() {
        assertEquals(120, CalculateArea.calculateArea(ShapeType.RECTANGLE, 10.0, 12.0));
        assertEquals(100, CalculateArea.calculateArea(ShapeType.SQUARE, 10.0));
        assertEquals(314.16, CalculateArea.calculateArea(ShapeType.CIRCLE, 10.0));
    }

    @Test
    void calculateArea_negativeValues() {
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.RECTANGLE,
                -10.0, -12.0));
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.SQUARE, -10.0));
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.CIRCLE, -10.0));
    }

    @Test
    void calculateArea_noValues() {
        assertThrows(RuntimeException.class, () -> CalculateArea.calculateArea(ShapeType.RECTANGLE));
        assertThrows(RuntimeException.class, () -> CalculateArea.calculateArea(ShapeType.SQUARE));
        assertThrows(RuntimeException.class, () -> CalculateArea.calculateArea(ShapeType.CIRCLE));
    }
}