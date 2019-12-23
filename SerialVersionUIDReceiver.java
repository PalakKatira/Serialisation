package com.palak.serialisation_example;
/**
 * In serialisation,the sender nd rreceiver can be different
 * Also,the machine of the sender and the receiver can be different
 * But make sure that the Class file of the object should be present on both the Sender and receiver m/c at the beginning
 * Only state of object travels from sender to receiver
 * JVM generates unique Identifier(UID) for every class during serialisation,
 * used at the time of deserialisation
 * @author Surbhi
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDReceiver {
	public static void main(String[] args)throws Exception {

	Serial s=new Serial();
	
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s);
	
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Serial s1=(Serial)ois.readObject();
	
	System.out.println(s1.i+" "+s1.j);
	}
}
