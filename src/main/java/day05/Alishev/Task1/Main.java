package day05.Alishev.Task1;

public class Main {
    public static void main(String[] args) {

        Teaher teaher = new Teaher("Михалыч", "Мастерство");
        Student student = new Student("Вася");


        teaher.evaluate(student);
    }
}
