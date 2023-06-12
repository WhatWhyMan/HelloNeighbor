package khclass_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import khclass_2.Practice_2_Person;
import khclass_2.Practice_2_Person;

public class Practice_2 {

	public void TestFileOutputStreamObject() {
		
		Practice_2_Person p1 = new Practice_2_Person("Hello, dorld");
		
		String filePath = "D:/data2/test/aaa.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
