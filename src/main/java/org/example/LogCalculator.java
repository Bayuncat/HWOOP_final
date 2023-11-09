package org.example;


public class LogCalculator implements Calculable{

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(ComplexNum arg) {
        ComplexNum firstArg = decorated.getResult();
        logger.log("первое значение калькулятора : " + firstArg + "Начало вызова метода sum с параметром " + arg);
        Calculable result = decorated.sum(arg);
        logger.log("вызов метода sum произошел успешно");
        return result;
    }

    @Override
    public Calculable multi(ComplexNum arg) {
        ComplexNum firstArg = decorated.getResult();
        logger.log("первое значение калькулятора : " + firstArg + "Начало вызова метода multi с параметром " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("вызов метода multi произошел успешно");
        return result;
    }

    @Override
    public Calculable divide(ComplexNum arg) {
        ComplexNum firstArg = decorated.getResult();
        logger.log("первое значение калькулятора : " + firstArg + "Начало вызова метода multi с параметром " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("вызов метода multi произошел успешно");
        return result;
    }


    @Override
    public ComplexNum getResult() {

        ComplexNum result = decorated.getResult();
        logger.log("Получаем результат: " + result);
        return result;
    }
}
