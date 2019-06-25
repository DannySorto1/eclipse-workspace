package com.class35;

public class MultipleCatch {
	public static void main(String[] args) {
		System.out.println("Beginning of the code");
		try {
			Thread.sleep(2000);//new InterruptedException
			System.out.println(10/0);//new ArithemticException
		}catch(ArithmeticException e) {
			//3 Ways to print name and details of an exception
			e.printStackTrace();//name of E, detail of E location
//			System.out.println(e);//name of E and Details
//			e.getMessage();//Prints Details of E 
			
			
			System.out.println("Code of Arithmetic Exception catch");
		}catch (InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");
		}
		

	}
}
