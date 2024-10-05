package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareException {
	  public static double square(int num) {
		   return num*num;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       try {
    	   System.out.println("entre number");
    	   int num=sc.nextInt();
    	   double result=square(num);
    	   System.out.println("result is:"+result);
       }
       catch(InputMismatchException e){
    	   System.out.println("num can not be character");
    	   e.printStackTrace();
			System.out.println(e);
       }
	}

}
