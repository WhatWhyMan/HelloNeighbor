package lclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIO3 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream("input2.txt");
				byte[] bs = new byte[26];
				int i;
				while((i=fis.read(bs))!=-1) {
					for(byte b : bs) {
						System.out.print((char)b);
					}
				}
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
