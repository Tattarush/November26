package day04.Alishev;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car(2020, "dark", "Ford");

        System.out.println(car1.getYear()+ " " +  car1.getModel()+ " " + car1.getColor());

    }
}


class Car {
    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model) {
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
