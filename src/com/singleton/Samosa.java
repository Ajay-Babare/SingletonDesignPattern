package com.singleton;

//Lazzy Approch of singleton design pattern
public class Samosa {

	//private because not to access from outside the class
	//static because instant can't access from static without object creation
	private static Samosa samosa;
	
	//private constructor to restrict object creation
	private Samosa() {}
	
	//public static becuase to access method from outside without creating object 
	public static Samosa getSamosa() {
		if(samosa == null) 
		
			//synchronized for thread safety
			synchronized(Samosa.class) {
				if(samosa == null) { 
					samosa = new Samosa();
				}
		}
		return samosa;
	}
}
