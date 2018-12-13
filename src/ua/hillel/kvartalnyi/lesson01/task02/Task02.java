package ua.hillel.kvartalnyi.lesson01.task02;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[][] mas = getInts();
        print(mas);
    }

    private static void print(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++)

                System.out.printf(mas[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] getInts() {
        int mas[][];
        mas = new int[10][10];
        Random ran = new Random();
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = ran.nextInt(100);
            }
        return mas;
    }
}

