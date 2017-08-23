package org.cap.boot;

public class MainClass {

	public static void main(String[] args) {
		display();
		SalesClass obj=new SalesClass();
		obj.show();
		obj.greetings();
		
	}
	
	public static void display(){
		System.out.println("Hello! Welcome To GIT!");
		System.out.println("MyBranch2 - update.");
		System.out.println("MyBranch2 - update1.");
		System.out.println("MyBranch2 - update2.");
		System.out.println("MyBranch2 - update3.");
		
	}

}
