package com.ironhack.practice_1.Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void stringHelper_empty() {
        assertEquals("", StringHelper.reverse(""));
        assertEquals("", StringHelper.encoder(""));
    }
    @Test
    void stringHelper_string() {
        assertEquals("aifos", StringHelper.reverse("sofia"));
        assertEquals("oicor", StringHelper.reverse("rocio"));
        assertEquals("ana", StringHelper.reverse("ana"));
        assertEquals("arual", StringHelper.reverse("laura"));
    }
    @Test
    void stringHelper_stringWithSpaces() {
        assertEquals("oicor aifos", StringHelper.reverse("sofia rocio"));
    }

    @Test
    void stringHelper_encoder() {
        assertEquals("s4f31", StringHelper.encoder("sofia"));
        assertEquals("r4c34", StringHelper.encoder("rocio"));
        assertEquals("1n1", StringHelper.encoder("ana"));
        assertEquals("l15r1", StringHelper.encoder("laura"));
    }
}