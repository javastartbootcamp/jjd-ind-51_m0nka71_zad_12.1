
public class Calculator {

    static void calculateValues(MathOperations[] operations) {
        for (MathOperations operation : operations) {
            double result = switch (operation.getMathSign()) {
                case "+" -> operation.getFirstNumber() + operation.getSecondNumber();
                case "-" -> operation.getFirstNumber() - operation.getSecondNumber();
                case "*" -> operation.getFirstNumber() * operation.getSecondNumber();
                case "/" -> operation.getFirstNumber() / operation.getSecondNumber();
                default -> 0;
            };
            System.out.printf("%.2f %s %.2f = %.2f\n",
                    operation.getFirstNumber(),
                    operation.getMathSign(),
                    operation.getSecondNumber(),
                    result);
        }
    }
}
