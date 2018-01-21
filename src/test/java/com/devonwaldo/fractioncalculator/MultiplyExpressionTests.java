package com.devonwaldo.fractioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyExpressionTests {

    @Test
    public void test_Constructor_Accepts2Terms() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(5, 5);
        MultiplyExpression expr = new MultiplyExpression(f1, f2);
    }

    @Test
    public void test_Constructor_SavesTerm1() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(5, 5);
        MultiplyExpression expr = new MultiplyExpression(f1, f2);
        Fraction f3 = expr.getTerm1();

        Assert.assertEquals(4, f3.getDenominator());
        Assert.assertEquals(1, f3.getNumerator());
    }

    @Test
    public void test_Constructor_SavesTerm2() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(5, 5);
        MultiplyExpression expr = new MultiplyExpression(f1, f2);
        Fraction f3 = expr.getTerm2();
        Assert.assertEquals(5, f3.getDenominator());
        Assert.assertEquals(5, f3.getNumerator());
    }
}
