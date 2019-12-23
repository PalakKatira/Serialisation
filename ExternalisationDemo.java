package com.palak.serialisation_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * In serialisation everything is controlled by JVM and so complexity is reduced
 * In case of Externalisation,everything is handled by user aand JVM does not have control
 * Say only property is required you can go with Externalisation or else every property will be saved
 * And so performance will be affected
 * Two methods in Externisable(1.1v) Interface-child interface of Serializable(1.1v)
 * 
 * 	1.writeExternal()
 * 	2.readExternal()
 * 
 * @author Surbhi
 *
 */

public class ExternalisationDemo {
	public static void main(String[] args) throws Exception{
		
		AccountDemo1 ac1=new AccountDemo1("Palak",22,21709);
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		AccountDemo1 ac2=(AccountDemo1)ois.readObject();
		
		System.out.println(ac2.s+" "+ac2.i+" "+ac2.j);
		
	}

}
