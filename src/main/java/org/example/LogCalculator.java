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
        logger.log("������ �������� ������������ : " + firstArg + "������ ������ ������ sum � ���������� " + arg);
        Calculable result = decorated.sum(arg);
        logger.log("����� ������ sum ��������� �������");
        return result;
    }

    @Override
    public Calculable multi(ComplexNum arg) {
        ComplexNum firstArg = decorated.getResult();
        logger.log("������ �������� ������������ : " + firstArg + "������ ������ ������ multi � ���������� " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("����� ������ multi ��������� �������");
        return result;
    }

    @Override
    public Calculable divide(ComplexNum arg) {
        ComplexNum firstArg = decorated.getResult();
        logger.log("������ �������� ������������ : " + firstArg + "������ ������ ������ multi � ���������� " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("����� ������ multi ��������� �������");
        return result;
    }


    @Override
    public ComplexNum getResult() {

        ComplexNum result = decorated.getResult();
        logger.log("�������� ���������: " + result);
        return result;
    }
}
