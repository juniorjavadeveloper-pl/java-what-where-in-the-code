package pl.juniorjavadeveloper.java.wwitc;

public class CalculatorResultData {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalculatorResultData{" +
                "result=" + result +
                '}';
    }
}
