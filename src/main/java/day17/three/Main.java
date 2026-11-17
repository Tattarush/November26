package day17.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path path = Path.of("Modern_notes.txt");

        try {
            String content = "Hello to future\nВторая строка";
            Files.writeString(path, content, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);


            List<String> strings = Files.readAllLines(path);
            for (String x : strings) {
                System.out.println(x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
