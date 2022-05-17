package ru.netology;

public class App {
    public static void main(String[] args) {
        int p1 = Calc.calc(100000, 12, 11);
        int p2 = Calc.calc(50000, 12, 9.1);
        int s1 = Calc.mult(48000, 4500, 4, 13.2);
        System.out.println("Платеж по 1-му кредиту: " + p1);
        System.out.println("Платеж по 2-му кредиту: " + p2);

        System.out.println("Платеж по имеющемуся обязательству с учетом возврата старховки: " + s1);

        System.out.println("Общий платеж: " + Calc.itog(p1, p2, s1));

    }
}
