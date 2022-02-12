package ru.skypro;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Task 1");
        var boxOne = 0.176547894;
        System.out.println("     1) var " + boxOne);
        byte boxTwo = 127;
        System.out.println("     2) byte " + boxTwo);
        short boxThree = 32767;
        System.out.println("     3) short " + boxThree);
        int boxFour = 2147483647;
        System.out.println("     4) int " + boxFour);
        long boxFive = 9223372036854775807L;
        System.out.println("     5) long " + boxFive);
        float boxSix = 7456.314675f;
        System.out.println("     6) float " + boxSix);
        double boxSeven = 54254.77777777;
        System.out.println("     7) double " + boxSeven);
        char boxEight = 34;
        System.out.println("     8) char " + boxEight);
        boolean boxNine = boxSix<=boxSeven;
        System.out.println("     9) boolean " + boxNine);

        System.out.println("Task 2");
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float together = boxerOne + boxerTwo;
        System.out.println("     Суммарный вес двух боксёров " + together + " кг");

        System.out.println("Task 3");
        short bananas = 5;
        short bananasWeight = 80;
        short milk = 200;
        short milkWeight = 105;
        short iceCream = 2;
        short iceCreamWeight = 100;
        short egg = 4;
        short eggWeight = 70;
        float mixed = ((bananas * bananasWeight) + (milk*milkWeight/100f) + (iceCream * iceCreamWeight) + (egg * eggWeight))/1000f;
        System.out.println("     Масса коктеля составит " + mixed + " кг");

        System.out.println("Task 4");
        int weightBefore = 7000;
        int weightStep500 = 500;
        int weightStep250 = 250;
        int quickFatBurn = weightBefore/weightStep500;
        int slowFatBurn = weightBefore/weightStep250;
        int mediumFatBurn = weightBefore/((weightStep500+weightStep250)/2);
        System.out.println("     При снижении веса по 500 грамм требуется " + quickFatBurn + " дней");
        System.out.println("     При снижении веса по 250 грамм требуется " + slowFatBurn + " дней");
        System.out.println("     При снижении веса по сбалансированной программе требуется " + mediumFatBurn + " дней");

        System.out.println("Task 5");
        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;
        float salaryMashaRise = salaryMasha*1.1f;
        float salaryDenisRise = salaryDenis*1.1f;
        float salaryKristinaRise = salaryKristina*1.1f;
        float salaryMashaBeforeRise12 = salaryMasha*12f;
        float salaryDenisBeforeRise12 = salaryDenis*12f;
        float salaryKristinaBeforeRise12 = salaryKristina*12f;
        float salaryMashaAfterRise12 = salaryMashaRise*12f;
        float salaryDenisAfterRise12 = salaryDenisRise*12f;
        float salaryKristinaAfterRise12 = salaryKristinaRise*12f;
        float differenceSalaryMasha = salaryMashaAfterRise12-salaryMashaBeforeRise12;
        float differenceSalaryDenis = salaryDenisAfterRise12-salaryDenisBeforeRise12;
        float differenceSalaryKristina = salaryKristinaAfterRise12-salaryKristinaBeforeRise12;
        System.out.println("     Зарплата Маши после повышения " + salaryMashaRise + " p");
        System.out.println("     Годовой доход Маши увеличится на " + differenceSalaryMasha + " p");
        System.out.println(" ");
        System.out.println("     Зарплата Дениса после повышения " + salaryDenisRise + " p");
        System.out.println("     Годовой доход Дениса увеличится на " + differenceSalaryDenis + " p");
        System.out.println(" ");
        System.out.println("     Зарплата Кристины после повышения " + salaryKristinaRise + " p");
        System.out.println("     Годовой доход Кристины увеличится на " + differenceSalaryKristina + " p");

    }
}