package day09.first;

public class Main {
    public static void main(String[] args) {

        Sup suPSup = new Sup();
        Sup1 s = new Sup1();
        Sup2 s2 = new Sup2();

        suPSup.who();
        suPSup = s;
        suPSup.who();
        suPSup = s2;
        suPSup.who();
    }
}


class Sup {

    void who() {
        System.out.println("it is Sup");
    }
}

class Sup1 extends Sup {

    void who() {
        System.out.println("Sup1");
    }
}

class Sup2 extends Sup {
    void who() {
        System.out.println("sUP2");
    }
}