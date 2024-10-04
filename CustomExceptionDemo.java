package exception;

import java.util.Scanner;

class CheckPassword extends Exception {
	public CheckPassword(String msg) {
		super(msg);
		
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the password");
		String password = sc.next();
		try {
			if (password.length() < 8)
				throw new CheckPassword("password length should be more than 8 char");
			else if (password.matches("[A-Za-z0-9]*"))
				throw new CheckPassword("password should have specila car");
			else
				System.out.println("valid passwords");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
