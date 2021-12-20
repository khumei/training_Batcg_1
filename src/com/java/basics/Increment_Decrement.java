package com.java.basics;

public class Increment_Decrement {

	public static void main(String[] args) {
		int i = 10;
		i = 20;
		int j = i++;
		System.out.println("Value of i is :" + i);
		System.out.println("Value of j is: " +j);
		int k = ++j;
		System.out.println("Value of k is :" + k);
		int l = k++ + ++k;
		System.out.println("Value of l is :" + l);
		int m = l++;
		int n = ++k + m++ - i-- - --i - --k;
		System.out.println();
		System.out.println("Value of i is: " +i);
		System.out.println("Value of j is: " +j);
		System.out.println("Value of k is: " +k);
		System.out.println("Value of l is: " +l);
		System.out.println();
		System.out.println("Home Work");
		System.out.println("Value of m is: " +m);
		System.out.println("Value of n is: " +n);
		
		//left to right
		//knowing the different between ++i and i++ as well as --i and i--
		
		//++ is know as increment operator
		//-- is known as increment operation
		//i++ this is known as post increment
		// ++i this is pre increment
		
		//i-- post decrement
		//--i pre decrement
		
		//left tp right
		//latest principal

	}

}
