package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("C:\\Users\\vikas pawar\\OneDrive\\Desktop\\my.txt");
			
			}
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}int k;
		
		try {
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}}
		 catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
