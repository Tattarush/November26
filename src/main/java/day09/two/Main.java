package day09.two;

public class Main {
    public static void main(String[] args) {

        TwoShape one = new TwoShape(2.0, " first");
        TwoShape two = new TwoShape(3.0, 4.0, "big");
        Triangle triangle = new Triangle(4.0, 5.5, "tr");
        Triangle triangle2 = new Triangle(4.0, "tr2");
        Triangle triangle3 = new Triangle(triangle2);


        TwoShape[] shapes = new TwoShape[5];
        shapes[0] = one;
        shapes[1] = two;
        shapes[2] = triangle;
        shapes[3] = triangle2;
        shapes[4] = triangle3;


        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}


class TwoShape {
    private double weight;
    private double height;
    private String name;


    TwoShape() {
        weight = height = 0;
        name = "Неизвестный тип";
    }

    TwoShape(double x, String n) {
        weight = height = x;
        name = n;
    }

    TwoShape(double x, double y, String n) {
        weight = x;
        height = y;
        name = n;
    }

    TwoShape(double x, double y) {
        weight = x;
        height = y;
        name = "none";
    }

    TwoShape(TwoShape ob) {
        weight = ob.getWeight();
        height = ob.getHeight();
        name = ob.name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return name;
    }

    public void setType(String type) {
        this.name = type;
    }


    double area() {
        System.out.println("Метод должен быть переопределен!");
        return 0.0;
    }
}


class Triangle extends TwoShape {
    private String style;
    Triangle() {
        super();
    }

    Triangle(double x, double y) {
        super(x, y);
        style = "none";
    }

    Triangle(double x, String str) {
        super(x, str);
        style = "none";
    }

    Triangle(Triangle ob) {
        super(ob);
    }

    Triangle(double x, double y, String str) {
        super(x, y, str);
    }

    double area() {
        return getWeight() * getHeight() / 2;
    }
}