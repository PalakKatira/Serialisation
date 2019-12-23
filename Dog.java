package com.palak.serialisation_example;

import java.io.Serializable;

public class Dog implements Serializable {// we can serialize only serializable objects

	
	// Static is not a part of object and so wont be stored in the file itself(not a
	// part of seriable)
	
	// Transient means not to serialize
	int i = 12;
	transient int j = 14;
	
	static int k = 5;
	
	// meaningless when you declare static variable as transient
	transient static int g = 9;
	
	//final variable will participate in serialisation but not in variable form but directly value form
	final int k1=1;//meaningless
}