/**
 *Java 1. Homework 3.
 *
 *@author Ivan Iov
 *@version dated Dec 01, 2017
 */
import java.util.Scanner;
import java.util.Random;

public class Homework3 {

    public static void main(String[] args) {
        repeat();
    }

    public static void guessNumber() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        Scanner number = new Scanner(System.in);
        for (int i = 0, j = 2; i < 3; i++, j--) {
            if (i == 0) {
                System.out.println("Guess the number from 0 to 9");
            }
            int attempt = number.nextInt();
            if (attempt > x && i < 2) {
                System.out.println("Your number is too big.You have "+ j +" more attempt(s).");
            } else if (attempt < x && i < 2) {
                System.out.println("Your number is too small.You have "+ j +" more attempt(s).");
            }
            if (i == 2 && attempt != x) {
                System.out.println("You lose! Do you want to play more? 1 - yes, 0 - no.");
                break;
            } else if (attempt == x) {
                System.out.println("You won! Do you want to play more? 1 - yes, 0 - no.");
                break;
            }
        }
    }

    public static void repeat() {
        guessNumber();
        Scanner again = new Scanner(System.in);
        for (int y = again.nextInt(); y == 1;) {
            guessNumber();
            if (again.nextInt() == 0) {
                break;
            }
        }
    }
}