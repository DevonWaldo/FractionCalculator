package com.devonwaldo.fractioncalculator;

public class MultiplyExpression {

    private Fraction term1;
    private Fraction term2;

    public MultiplyExpression(Fraction term1, Fraction term2) {
        this.term1 = term1;
        this.term2 = term2;
    }

    public Fraction getTerm1() {
        return term1;
    }

    public Fraction getTerm2() {
        return term2;
    }
}
