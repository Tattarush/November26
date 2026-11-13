package day13.first;

public class Main {
    public static void main(String[] args) {

        TwoShape twoShape = new Triangle(10.0, 20.0);

        System.out.println(twoShape.area());

    }
}


abstract class TwoShape {

    private double x;
    private double y;

    TwoShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


class Triangle extends TwoShape {


    public Triangle(double x, double y) {
        super(x, y);

    }

    @Override
    double area() {
        return  super.getX() * super.getY();
    }
}