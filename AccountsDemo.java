package com.palak.serialisation_example;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AccountsDemo implements Serializable{

	/*String _UserName="Palak";
	transient String _passWord="Durga";//since password is secured*/
	 
	String _userName="Palak";
	transient String _passWord="Durga";
	transient int _pinNumber=3435;
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();//imp to write
		String epassWord="123"+_passWord;
		int epinnumber=0+_pinNumber;
		oos.writeObject(epassWord);
		oos.writeObject(epinnumber);
	}
	private void readObject(ObjectInputStream ois)throws Exception{
		ois.defaultReadObject();//imp to write
		String epassword=(String)ois.readObject();
		int epinnumber=(int)ois.readObject();
		
		//order should be same.	
		_passWord=epassword.substring(3);
		_pinNumber=epinnumber-0;
	}
	 
}
