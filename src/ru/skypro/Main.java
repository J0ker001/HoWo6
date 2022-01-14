package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        int maxExpensesDay = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (arr[i] > maxExpensesDay) {
                maxExpensesDay = arr[i];
            }
        }
        System.out.print("Максимальная сумма трат за день составила " + maxExpensesDay + " рублей. ");

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей");

        System.out.println();

        float averageAmount = sum * 1f / generateRandomArray().length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
