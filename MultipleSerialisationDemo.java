package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * We can easily serialise multiple objects to the file but certain rules need
 * to be followed 1.Deserialisation should be in the same order as of
 * Serialisation or else it will give an exception Order of objects is important in serialisation
 * Exception thrown will be RE ClassCastException.
 * @author Surbhi
 *
 */

public class MultipleSerialisationDemo {

	public static void main(String[] args) throws Exception {

		Dog d = new Dog();
		Cat c = new Cat();

		//Serialisation
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);

		// Deserialisation
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		Cat c1 = (Cat) ois.readObject();
		
		//If you dont know the order of Serialisation of object,use instanceOf operator
		Object o=ois.readObject();
		if(o instanceof Dog) {
			//perform Dog realted operation
		}
		else if(o instanceof Cat) {
			//Perform cat related operations
		}
		//and continue
		
		
		System.out.println(d1.i + " " + d1.j + " " + d1.k);

	}
}
