package day05.Alishev.first;

public class Main {
    public static void main(String[] args) {


        B b = new B(1, 2, 3);
        b.show();
        b.show("fantastic");

    }
}


class A {

    private int i;
    private int j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println(j+" " + i);
    }
}


class B extends A {
    private int k;


    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(String x) {
        System.out.println(k+k + x);
    }
}