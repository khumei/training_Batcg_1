package com.java.basics;

public class Method_Basics {

	public static void main(String[] args) {
		System.out.println("This is the test method");
		
		int k1 = test();
		System.out.println(k1);
		test1();
		test2();
				
		Method_Basics objref = new Method_Basics();
		objref.test4();
	}

	public static int test () {
		System.out.println("This is the test method");
		int i = 10;
		int j = 20;
		int k = i +j;
		
		return k;
	}
	
	public static String test1() {
		System.out.println("This is the test1 methog");
		String S1 = "Java";
		String S2 = "Python";
		String S3 = "C#";
		
		String S4 = S1 + S2 + S3;
		return S4;
		
	}
	
	public static boolean test2() {
		System.out.println("This is the test1 methog");
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 1>2;
				
		return b3;
		
	}
	public void test4() {
		System.out.println("This the test4 method");
	}
}
