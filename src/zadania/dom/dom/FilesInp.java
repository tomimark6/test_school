package zadania.dom.dom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesInp {
    public static void main(String[] args) {
        Path inputPath = Paths.get("input_names.txt");

        try {
            List<String> inputLines = Files.readAllLines(inputPath);

            for (String line : inputLines){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Bledna nazwa pliku wejsciowego");
            throw new RuntimeException(e);
        }
    }
}
