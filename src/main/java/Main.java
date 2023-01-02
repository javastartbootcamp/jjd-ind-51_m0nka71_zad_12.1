import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String fileName = "operations.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
        if (fileExists) {
            try {
                MathOperations[] operations = CalculatorFileReader.readFile(fileName);
                Calculator.calculateValues(operations);
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        } else {
            System.out.println("Plik nie istnieje");
        }
    }
}