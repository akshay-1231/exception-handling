package exception;

import java.util.Scanner;

public class StringConvert {

	public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("entre number");
             String userInput = sc.nextLine();
             try {
            	 int num=Integer.parseInt(userInput);
            	    System.out.println("num converted to integer"+num);
             }catch(NumberFormatException e) {
            	    System.out.println("entred integer is invalid");
             }


	}

}
