package exception;

import java.util.Scanner;

public class MultiExceptionDemo {
	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre 2 numbers");
		String str = sc.next();
		String str1 = sc.next();
		try {
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);
			double result = divide(num1, num2);
			System.out.println("result is" + result);
		}

		catch (ArithmeticException e) {
			System.out.println("we can not divide by 0");
		} catch (NumberFormatException e1) {
			System.out.println("the value ecpected is number not string");
		} catch (Exception e) {
			System.out.println("error: ther is error");
		} finally {
			System.out.println("this is finally block");
		}

	}

}
