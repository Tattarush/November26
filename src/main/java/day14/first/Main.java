package day14.first;

public class Main {
    public static void main(String[] args) {


        FinalID finalID = new FinalID();

        System.out.println(finalID.err(2));
        System.out.println(finalID.err(5));


    }
}


class FinalID {

    final int FIRSTERR = 1;
    final int SECONDERR = 2;
    final int THIRDERR = 3;

    String[] errors = {"Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"};


    String err(int i) {

            if (i > 0 && i < errors.length) {
                return errors[i];
            } else {
               return  "Неизвестный код ошибки";
            }
        }
    }

