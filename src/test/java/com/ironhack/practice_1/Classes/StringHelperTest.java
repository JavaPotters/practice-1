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
        assertEquals("", StringHelper.stringHelper(""));
    }
    @Test
    void stringHelper_string() {
        assertEquals("aifos", StringHelper.stringHelper("sofia"));
        assertEquals("oicor", StringHelper.stringHelper("rocio"));
        assertEquals("ana", StringHelper.stringHelper("ana"));
    }
    @Test
    void stringHelper_stringWithSpaces() {
        assertEquals("oicor aifos", StringHelper.stringHelper("sofia rocio"));
    }
}