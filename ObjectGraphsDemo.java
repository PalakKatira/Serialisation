package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphsDemo {
	public static void main(String[] args) throws Exception
	{

		Dod1 d = new Dod1();

		// Serialisation
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		// Deserialisation
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dod1 d1 = (Dod1) ois.readObject();
		
		System.out.println(d1.c1.r.j);

	}
}
