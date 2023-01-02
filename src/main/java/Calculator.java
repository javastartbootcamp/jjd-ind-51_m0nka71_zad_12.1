import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

    private double firstNumber;
    private String mathSing;
    private double secondNumber;

    public Calculator(double firstNumber, String mathSing, double secondNumber) {
        this.firstNumber = firstNumber;
        this.mathSing = mathSing;
        this.secondNumber = secondNumber;
    }

    static Calculator[] readFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Calculator[] result = new Calculator[lines];
        for (int i = 0; i < lines; i++) {
            String line = scan.nextLine();
            String[] split = line.split(" ");
            double firstNumber = Double.parseDouble(split[0]);
            String sign = split[1];
            double secondNumber = Double.parseDouble(split[2]);
            result[i] = new Calculator(firstNumber, sign, secondNumber);
        }
        return result;
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scan = new Scanner(new File(fileName))) {
            while (scan.hasNextLine()) {
                scan.nextLine();
                lines++;
            }
        }
        return lines;
    }

    static void calculateValues(Calculator[] calculators) {
        double result = 0;
        for (Calculator calculator : calculators) {
            if (calculator.mathSing.equals("+")) {
                result = calculator.firstNumber + calculator.secondNumber;
                System.out.println(calculator.firstNumber + " + " + calculator.secondNumber + " = " + result);
            } else if (calculator.mathSing.equals("-")) {
                result = calculator.firstNumber - calculator.secondNumber;
                System.out.println(calculator.firstNumber + " - " + calculator.secondNumber + " = " + result);
            } else if (calculator.mathSing.equals("*")) {
                result = calculator.firstNumber * calculator.secondNumber;
                System.out.println(calculator.firstNumber + " * " + calculator.secondNumber + " = " + result);
            } else if (calculator.mathSing.equals("/")) {
                result = (calculator.firstNumber / calculator.secondNumber);
                System.out.println(calculator.firstNumber + " + " + calculator.secondNumber + " = " + result);
            }
        }
    }
}
