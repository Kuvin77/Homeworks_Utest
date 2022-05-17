package ru.netology;

public class Calc {

    // расчет имеющихся обязательств с учетом внесенной оплаты
    public static int mult(int sum, double oplat, int period, double percent) {
        double dolg = sum - oplat;
        double result = (dolg + (dolg / 100 * percent)) / period;
        return (int) result;
    }

    // расчет новых кредитов
    public static int calc(int summa, int period, double percent) {
        double platez = (summa + (summa / 100 * percent)) / period;
        return (int) platez;
    }
    // итог
    public static int itog(int a, int b, int c){
        int itog = (a + b + c);
        return itog;
    }
}
