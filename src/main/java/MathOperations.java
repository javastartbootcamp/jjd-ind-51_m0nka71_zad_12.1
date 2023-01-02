public class MathOperations {
    private double firstNumber;
    private String mathSign;
    private double secondNumber;

    public MathOperations(double firstNumber, String mathSign, double secondNumber) {
        this.firstNumber = firstNumber;
        this.mathSign = mathSign;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getMathSign() {
        return mathSign;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
