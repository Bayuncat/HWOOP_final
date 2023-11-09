package org.example;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {

        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {

            Double primaryArg1 = promptDouble("¬ведите вещественную часть первого числа: ");
            Double primaryArg2 = promptDouble("¬ведите мнимую часть первого числа: ");
            ComplexNum primaryArg = new ComplexNum(primaryArg1, primaryArg2);

            Calculable calculator = calculableFactory.create(primaryArg);

            while (true) {
                String cmd = prompt("¬ведите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {

                    Double arg1 = promptDouble("¬ведите вещественную часть второго числа: ");
                    Double arg2 = promptDouble("¬ведите мнимую часть второго числа: ");
                    ComplexNum arg = new ComplexNum(arg1, arg2);
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    Double arg1 = promptDouble("¬ведите вещественную часть второго числа: ");
                    Double arg2 = promptDouble("¬ведите мнимую часть второго числа: ");
                    ComplexNum arg = new ComplexNum(arg1, arg2);
                    calculator.sum(arg);
                    continue;
                }

                if (cmd.equals("/")) {

                    Double arg1 = promptDouble("¬ведите вещественную часть второго числа: ");
                    Double arg2 = promptDouble("¬ведите мнимую часть второго числа: ");
                    ComplexNum arg = new ComplexNum(arg1, arg2);
                    calculator.divide(arg);
                    continue;
                }

                if (cmd.equals("=")) {
                    //"–езультат %d\n", result.getA() + " + " +result.getB()+"*i"
                    ComplexNum result = calculator.getResult();
                    System.out.println(result.toString());
                    break;
                }
            }
            String cmd = prompt("≈ще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}