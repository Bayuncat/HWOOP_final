package org.example;

public class LogCalculableFactory implements ICalculableFactory{

    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNum primaryArg) {

        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
