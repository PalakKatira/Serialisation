package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serializable is a marker interface that means it has ni methods in it.
 * Everything is handovered to JVM
 * In serialisation,we are saving data permanently to the file
 * @author Surbhi
 *
 */

public class SerialisationDemo {

	public static void main(String[] args) throws Exception {
		
		//if the object does not implement serialisable.
		//It throws a runtime exception,thus the corresponding class should implement serialisable
		Dog d=new Dog();
		
		//Serialisation
		//The process of writing state of an object to a file is called serialisation
		//It is the process of converting the object from java supported form to either 
		//file supported or network supported form
		
		FileOutputStream fos=new FileOutputStream("abc.ser");//here note that you can give any extension
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		//Deserialisation
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.i+" "+d1.j);
		
	}
}
