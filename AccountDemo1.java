package com.palak.serialisation_example;

import java.io.Externalizable;//not a marker interface,contains 2 methods
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class AccountDemo1 implements Externalizable {// child interface of serializable-

	// Properties
	String s;
	int i;
	int j;

	// For instance variable create constructors
	public AccountDemo1(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	//At the time of externalistion,A new object will be created because all the properties are not saved
	public AccountDemo1() {
		System.out.println("Compulsory at the time of deserialisation");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//write only those proprties which are needed by the user
		out.writeObject(s);
		out.writeObject(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s=(String)in.readObject();
		i=(int)in.readObject();

	}

}
