package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Imagecpy {

	public static void main(String[] args)throws IOException {
		FileInputStream fr = new FileInputStream("D://Thala 7.jpg");
		FileOutputStream fw = new FileOutputStream("D://gokul.jpg");
		int ch;
		while((ch = fr.read()) != -1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("image copied");

	}

}
