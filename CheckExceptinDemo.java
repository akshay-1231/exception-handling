package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptinDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Akshay\\myfile.txt");
			int k;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("error: path is wrong for file, check the path");
		}

	}
}