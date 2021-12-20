package com.java.basics;

public class If_else {

	public static void main(String[] args) {
		// if (condition - true or false)
		// block of code
		int i = 10;
		int j = 20;
		int k = 30;
		
		
		if (i>j & j>k ) {
			System.out.println("I is the Largest");
		}else if (j>i & i>k) {
			System.out.println("J is Largest");
		}else {
			System.out.println("K is the Largest");
		}

	}

}
