import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

    static Math[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        Math[] equations = new Math[linesNumber];
        try (Scanner scan = new Scanner(new File(fileName))) {
            for (int i = 0; i < equations.length; i++) {

            }
        }
        return equations;
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
