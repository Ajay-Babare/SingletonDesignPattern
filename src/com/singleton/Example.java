package com.singleton;

public class Example {

	public static void main(String[] args) {
		Samosa obj1 = Samosa.getSamosa();
		System.out.println(obj1.hashCode());
		Samosa obj2 = Samosa.getSamosa();
		System.out.println(obj2.hashCode());
		
		Jalebi obj3 = Jalebi.getJalebi();
		System.out.println(obj3.hashCode());
		Jalebi obj4 = Jalebi.getJalebi();
		System.out.println(obj4.hashCode());
	}

}
