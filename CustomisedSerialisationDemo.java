package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * To recover loss of information because of transient keyword,use Customised Serialisation
 * The extra work that we are doing at customer side and sender side is called as customised serialisation.
 *  1.Prepare ana encrypted password say 1234Durga
 *  2.write That manually in the file
 *  3.Assign this to original password
 * Can be achieved using 2 methods
 * 
 *  1.private void witeObject(OOS) Throws Exception
 *  2.private void readObject(OIS) Throws Exception
 *  
 * Place this methods in the AccountDemo Class. 
 * 
 * @author Surbhi
 *
 */

public class CustomisedSerialisationDemo {
	public static void main(String[] args) throws Exception {//main is called as call back method-by JVM.

		/**
		 * Loss of password after reading it out from the file as the password was declared as transient
		 */
		
		/*AccountsDemo ac = new AccountsDemo();
		System.out.println(ac._UserName+" "+ac._passWord);
		
		//Serialisation
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac);
		
		//Deserialisation
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		AccountsDemo ac1=(AccountsDemo)ois.readObject();
		
		System.out.println(ac1._UserName+" "+ac1._passWord);*/
		
		/**
		 * Customised Serialisation
		 */
		AccountsDemo ac = new AccountsDemo();
		System.out.println(ac._userName+" "+ac._passWord+" "+ac._pinNumber);
		
		//Serialisation
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac);
		
		//Deserialisation
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		AccountsDemo ac1=(AccountsDemo)ois.readObject();
		
		System.out.println(ac1._userName+" "+ac1._passWord+" "+ac1._pinNumber);
		
	}
}