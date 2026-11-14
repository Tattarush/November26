package day14.two;

import day14.two.b.B;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.print();
        // b.print();
        A a1 = new B();
        a1.print();
    }
}


