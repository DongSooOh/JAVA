package javaIO;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:/web/javaProject/src/javaIO/FileInputStreamExample.java");
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}