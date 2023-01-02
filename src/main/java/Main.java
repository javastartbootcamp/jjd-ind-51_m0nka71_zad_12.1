import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "operations.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Calculator[] calculators = Calculator.readFile(fileName);
        Calculator.calculateValues(calculators);
        reader.close();
    }
}