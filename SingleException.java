package exception;
import java.util.Scanner;
public class SingleException {
   public static double divide(int num1,int num2) {
	   return num1/num2;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("entre 2 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			double result=divide(num1,num2);
			System.out.println("result is"+result);
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("we can not divide number by 0");
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
