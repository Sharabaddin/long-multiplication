package com.sharabaddin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArtfulArithmeticTest {
    @Test
    public void multiBigInteger_checkEmptyString() {
        assertEquals("", ArtfulArithmetic.multiBigInteger("", 9));
    }

    @Test
    public void multiBigInteger_checkNullString() {
        assertEquals("", ArtfulArithmetic.multiBigInteger(null, 9));
    }

    @Test
    public void multiBigInteger_withoutOverflow() {
        // Max Integer =  2147483647 * max parameter
        assertEquals("19327352823", ArtfulArithmetic.multiBigInteger("2147483647", 9));
    }

    @Test
    public void multiBigInteger_negativeNumber() {
        assertEquals("", ArtfulArithmetic.multiBigInteger("-1", 9));
    }

    @Test
    public void multiBigInteger_incorrectNumber() {
        assertEquals("", ArtfulArithmetic.multiBigInteger("q1q2e3w", 9));
    }

    @Test
    public void multiBigInteger_maxInteger() {
        // Max Integer =  2147483647 * max parametr
        assertEquals("19327352823", ArtfulArithmetic.multiBigInteger("2147483647", 9));
    }

    @Test
    public void multiBigInteger_checkDownInterval() {
        // Range [1..9]
        assertEquals("", ArtfulArithmetic.multiBigInteger("2147483647", 0));
    }

    @Test
    public void multiBigInteger_checkUpInterval() {
        // Range [1..9]
        assertEquals("", ArtfulArithmetic.multiBigInteger("2147483647", 10));
    }
}
