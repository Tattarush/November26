package day04.Alishev.Task04;

public class Airplane {

    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                "длина: " + length + " вес: " + weight + ", количество топлива в баке: " + fuel);

    }

    void fillUp(double up) {
        this.fuel += up;
    }
}
