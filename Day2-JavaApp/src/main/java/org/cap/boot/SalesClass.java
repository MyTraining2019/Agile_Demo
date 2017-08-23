package org.cap.boot;

public class SalesClass {
	
	int[] arr={1,2,3,4,5,6,7};
	
	public void show(){
		int sum=0;
		for(int num:arr){
			sum+=num;
			System.out.println(num);
		}
		System.out.println("Sum:" + sum);
	}
	
	public void greetings(){
		System.out.println("Good Morning!");
		System.out.println("Lets have a break!");
		System.out.println("Good Afternoon!");
		System.out.println("Good Evening!");
		System.out.println("Good Day!");
	}

}
