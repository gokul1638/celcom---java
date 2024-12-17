package com.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://gokul.txt");
		FileWriter fw = new FileWriter("D://kul.txt");
		int ch;
		while((ch = fr.read()) != -1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
		

	}

}
