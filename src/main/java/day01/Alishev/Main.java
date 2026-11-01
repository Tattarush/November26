package day01.Alishev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, countZero = 0, sumZero = 0;
        int[] array = new int[100];
        fill(array);

        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                countZero++;
                sumZero += x;
            }
        }

        System.out.println("Наибольший элемент массива - " + max);
        System.out.println("Наименьший элемент массива - " + min);
        System.out.println("Количество элементов оканчивающихся на ноль - " + countZero);
        System.out.println("Сумма элементов оканчивающихся на ноль - " + sumZero);

    }

    static void fill(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10001);
        }
    }
}
