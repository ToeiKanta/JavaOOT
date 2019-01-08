/*
    จงรับค่าตัวเลข (สามารถเป็นได้ทั้งจำนวนเต็มและเลขมีจุดทศนิยม)
    จนกว่าจะรับค่า 0 เข้ามา
    ให้หาค่าเฉลี่ย และค่าสูงสุดลำดับที่ 2
    ของตัวเลขจำนวนเต็มและเลขมีจุดทศนิยมแยกกัน
    ต้องเป็น Method หาค่าเฉลี่ย และค่าสูงสุดลำดับที่ 2 แยกกันด้วย
*/

package oot.lab3;
import java.util.Scanner;

public class SpecialQuiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float number = 1;
        int stepInt = 0;
        int stepFloat = 0;

        float maxFloat = 0;
        float secondMaxFloat = 0;
        float sumFloat = 0;

        int maxInt = 0;
        int secondMaxInt = 0;
        int sumInt = 0;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextFloat();

            if (number == 0) break;
            //Check if Float values
            else if (number % 1 != 0) {
                stepFloat++; //count Float values

                if (stepFloat == 1) {
                    maxFloat = number;
                    secondMaxFloat = number;
                    sumFloat = getSum(sumFloat, number);
                }
                else {
                    if(number > maxFloat) {
                        secondMaxFloat = maxFloat;
                        maxFloat = getMax(maxFloat, number);
                    }
                    sumFloat = getSum(sumFloat, number);
                }
            }
            // Integer values
            else {
                stepInt++; //count Int values
                int numberInt = (int) (number - (number % 1));

                if (stepInt == 1) {
                    maxInt = numberInt;
                    secondMaxInt = numberInt;
                    sumInt = getSum(sumInt, numberInt);
                }
                else {
                    if (number > maxInt){
                        secondMaxInt = maxInt;
                        maxInt = getMax(maxInt, numberInt);
                    }
                    sumInt = getSum(sumInt, numberInt);
                }
            }

        } while (number != 0);

        System.out.println("Average INT : " + getAverage(sumInt, stepInt));
        System.out.println("Second Max INT: " + secondMaxInt);

        System.out.println("Average FLOAT : " + getAverage(sumFloat, stepFloat));
        System.out.println("Second Max FLOAT: " + secondMaxFloat);
    }

    public static float getMax(float max, float number) {
        return number >= max ? number : max;
    }
    public static int getMax(int max, int number) {
        return number >= max ? number : max;
    }
    public static float getSum(float sum, float number) {
        return sum + number;
    }
    public static int getSum(int sum, int number) {
        return sum + number;
    }
    public static float getAverage(float sum, float step) {
        if (step == 0) return 0;
        else return sum/step;
    }
    public static float getAverage(int sum, int step) {
        if (step == 0) return 0;
        else return (float) sum/step;
    }
}
