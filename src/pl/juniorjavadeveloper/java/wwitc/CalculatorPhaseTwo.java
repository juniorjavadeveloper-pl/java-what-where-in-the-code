package pl.juniorjavadeveloper.java.wwitc;

public class CalculatorPhaseTwo {
    public static int sum(CalculatorInputData inputData) {
        System.out.println("sum(" + inputData + ")");
        int sum = inputData.getA() + inputData.getB();
        System.out.println("sum=" + sum);
        return sum;
    }
}
