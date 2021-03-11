package pl.juniorjavadeveloper.java.wwitc;

public class CalculatorPhaseThree {
    public static CalculatorResultData sum(CalculatorInputData inputData) {
        System.out.println("sum(" + inputData + ")");
        int sum = inputData.getA() + inputData.getB();
        CalculatorResultData resultData = new CalculatorResultData();
        resultData.setResult(sum);
        System.out.println("resultData=" + resultData);
        return resultData;
    }
}
