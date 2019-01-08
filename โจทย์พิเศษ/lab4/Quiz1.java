package oot.lab4;

/*
    รับตัวเลข 10 ตัว ที่เป็นได้ทั้ง int และ double
    โดยให้เป็น int 5 ตัว และ double 5 ตัว
    แล้วให้ใส่ Array 2D 2X5 โดยให้
    แถวแรกเป็นค่า int เรียงจากน้อยไปมาก
    แถวที่สองเป็นค่า int เรียงจากมากไปน้อย
*/

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        double[][] number = new double[2][5];
        Scanner sc = new Scanner(System.in);
        int int_count = 0;
        int double_count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + " : Enter a number : ");
            double temp = sc.nextDouble();

            if (temp % 1 > 0) {
                number[1][double_count] = temp;
                double_count++;
            }
            else {
                number[0][int_count] = temp;
                int_count++;
            }
        }

        System.out.println("Before sorting");
        printArray(number[0]);
        printArray(number[1]);

        //Sorting
        for (int i = 0; i < number[0].length; i++) {
            int min = i;
            for (int j = i; j < number[0].length; j++) {
                min = number[0][j] < number[0][min] ? j : min;
            }

            double temp = number[0][i];
            number[0][i] = number[0][min];
            number[0][min] = temp;
        }

        for (int i = 0; i < number[1].length; i++) {
            int max = i;
            for (int j = i; j < number[1].length; j++) {
                max = number[1][j] > number[1][max] ? j : max;
            }

            double temp2 = number[1][i];
            number[1][i] = number[1][max];
            number[1][max] = temp2;
        }

        //Print array
        System.out.println("After sorting");
        printArray(number[0]);
        printArray(number[1]);
    }

    public static void printArray(double[] arr) {
        for (double obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
