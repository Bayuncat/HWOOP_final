package org.example;

public interface Calculable {
    Calculable sum(ComplexNum arg);
    Calculable multi(ComplexNum arg);
    Calculable divide(ComplexNum arg);
    ComplexNum getResult();
}
