package org.example;

public final class Calculator implements Calculable {

    private ComplexNum primaryArg;

    public Calculator(ComplexNum primaryArg) {

        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNum arg) {
        primaryArg.setA(primaryArg.getA() + arg.getA());
        primaryArg.setB(primaryArg.getB() + arg.getB());
        return this;
    }

    @Override
    public Calculable multi(ComplexNum arg) {
        double buf = primaryArg.getA();
        primaryArg.setA(primaryArg.getA() * arg.getA() - primaryArg.getB() * arg.getB());
        primaryArg.setB(buf * arg.getB() + primaryArg.getB() * arg.getA());
        return this;
    }

    @Override
    public Calculable divide(ComplexNum arg) {
        double buf = primaryArg.getA();

        primaryArg.setA((primaryArg.getA() * arg.getA() + primaryArg.getB() * arg.getB())/
                Math.pow(arg.getA(),2) + Math.pow(arg.getB(),2));

        primaryArg.setB((primaryArg.getB() * arg.getA() - buf * arg.getB())/
                Math.pow(arg.getA(),2) + Math.pow(arg.getB(),2));
        return this;
    }

    @Override
    public ComplexNum getResult() {
        return primaryArg;
    }


}
