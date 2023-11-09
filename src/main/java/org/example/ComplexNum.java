package org.example;

public class ComplexNum {

    private double a;
    private double b;

    ComplexNum(double a1, double b1) {
        a = a1;
        b = b1;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Результат операции будет комплексное число: " + a + " + " + b+"*i";
    }
}
