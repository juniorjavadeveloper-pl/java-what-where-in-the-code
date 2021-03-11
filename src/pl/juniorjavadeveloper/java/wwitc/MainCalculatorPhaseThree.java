package pl.juniorjavadeveloper.java.wwitc;

import java.util.Scanner;

public class MainCalculatorPhaseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();

        System.out.println("Jakie działanie wykonać?");
        System.out.println("1. Dodawanie");
        int operation = scanner.nextInt();

        CalculatorResultData resultData = new CalculatorResultData();
        if (operation == 1) {
            CalculatorInputData inputData = new CalculatorInputData();
            inputData.setA(a);
            inputData.setB(b);

            resultData = CalculatorPhaseThree.sum(inputData);
        }
        System.out.println("Wynik działania: \n" + resultData);
    }
}
