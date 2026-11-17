package day17.two;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "notes.txt";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Первая строка текста");
            writer.newLine();
            writer.write("Вторая строка");
            System.out.println("Файл успешно записан");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            throw new RuntimeException(e);
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            System.out.println("Содержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Успех! Файл успешно прочитан!");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка чнения файла");
            throw new RuntimeException(e);
        }
    }
}
