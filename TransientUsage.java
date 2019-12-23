package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Transient keyword/modifiers applicable only for variables,not for class,not for methods
 * The data in the fike is stored permanently,and secured data should not be stored permanently in the file
 * So,while writing sensitive data we should use transient in front of secured variable
 * @author Surbhi
 *
 */

public class TransientUsage {

	public static void main(String[] args) throws Exception {
		
		//serialisable object as it implements Serialisable interface
		Dog d = new Dog();

		//Serialisation
		//At the time of serialisation,we don't want to save the value of particular variable to meet security constarints
		//then declare the variable as transient
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		//Deserialisation
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.i+" "+d1.j+" "+d1.k);
		
	}
}
