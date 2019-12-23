package com.palak.serialisation_example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDSender {
	public static void main(String[] args)throws Exception {
		
		Serial s=new Serial();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
	}

}
