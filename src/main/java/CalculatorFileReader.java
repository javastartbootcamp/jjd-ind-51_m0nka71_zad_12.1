import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatorFileReader {

    static MathOperations[] readFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        MathOperations[] result = new MathOperations[lines];
        for (int i = 0; i < lines; i++) {
            String line = scan.nextLine();
            String[] split = line.split(" ");
            double firstNumber = Double.parseDouble(split[0]);
            String sign = split[1];
            double secondNumber = Double.parseDouble(split[2]);
            result[i] = new MathOperations(firstNumber, sign, secondNumber);
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
}
