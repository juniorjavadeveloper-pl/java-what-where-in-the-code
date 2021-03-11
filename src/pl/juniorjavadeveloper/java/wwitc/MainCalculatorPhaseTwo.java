package pl.juniorjavadeveloper.java.wwitc;

import java.util.Scanner;

public class MainCalculatorPhaseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();

        System.out.println("Jakie działanie wykonać?");
        System.out.println("1. Dodawanie");
        int operation = scanner.nextInt();

        int result = 0;
        if (operation == 1) {
            CalculatorInputData inputData = new CalculatorInputData();
            inputData.setA(a);
            inputData.setB(b);

            result = CalculatorPhaseTwo.sum(inputData);
        }
        System.out.println("Wynik działania: " + result);
    }
}
