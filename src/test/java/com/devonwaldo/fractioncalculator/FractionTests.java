package com.devonwaldo.fractioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class FractionTests {
    @Test
    public void test_Constructor_AcceptsNumeratorAndDenominator(){
        Fraction f = new Fraction(1, 2);
    }

    @Test
    public void test_Constructor_SavesNumerator() {
        Fraction f = new Fraction(1, 2);
        Assert.assertEquals(1, f.getNumerator());
    }

    @Test
    public void test_Constructor_SavesDenominator() {
        Fraction f = new Fraction(1, 2);
        Assert.assertEquals(2, f.getDenominator());
    }
}
