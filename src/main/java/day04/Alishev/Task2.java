package day04.Alishev;

public class Task2 {
    public static void main(String[] args) {

        Motorcycle moto = new Motorcycle(2025, "white", "harley");

        System.out.println(moto.getModel() + " " + moto.getYear() + " " + moto.getColor());

    }
}

class Motorcycle {

    private int year;
    private String color;
    private String model;

    public Motorcycle(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
