package com.singleton;
//Eager Approach of Singleton design pattern
public class Jalebi {
	// Restrict object creation
	private Jalebi() {}
	
	//eagerly object creation
	private static Jalebi jalebi = new Jalebi();
	
	//synchronized for thread safety
	public static synchronized Jalebi getJalebi() {
		return jalebi;
	}
	
}
