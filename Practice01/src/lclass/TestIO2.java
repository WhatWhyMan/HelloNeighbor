package lclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIO2 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream("input.txt");
				int i;
				while((i=fis.read())!=-1) {
					System.out.print((char)i);
				}
				System.out.println();
				System.out.println("end");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				} catch (NullPointerException e) {
					System.out.println(e);
				}
			}
	}

}
