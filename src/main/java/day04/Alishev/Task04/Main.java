package day04.Alishev.Task04;

public class Main {
    public static void main(String[] args) {


        Airplane airplane = new Airplane("aba", 2018, 100.0, 250);

        airplane.info();

        airplane.fillUp(12345.0);
        airplane.info();
        airplane.fillUp(1000000.0);
        airplane.info();
    }
}
