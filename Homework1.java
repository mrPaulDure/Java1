/**
 *Java 1. Homework 1.
 *
 *@author Ivan Iov
 *@version dated Nov 22, 2017
 */
public class Homework1 {
	public static void main(String[] args) {
		byte a = 15;
		short b = 126;
		int c = 2356;
		long d = 12033L;
		float e =  155.0f;
		double f = 16.2265;
		boolean g = true;
		char h = 'G';
		System.out.println(calculate(5,8,15,5));
		System.out.println(task10and20(6,8));
		isPositiveOrNegative(-6);
		System.out.println(isNegative(5));
		greetings("Ivan");
	}
	public static int calculate(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}
	public static boolean task10and20(int x, int y) {
		if (x + y >= 10 && x + y <= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void isPositiveOrNegative(int number1) {
        if (number1 >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}
    }
	
	public static boolean isNegative(int number2) {
		if (number2 < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void greetings(String name) {
		System.out.println("Hello, " + name);
	}
}