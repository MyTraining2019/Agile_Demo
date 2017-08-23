package org.cap.boot;

public class SalesClass {
	
	public void show(){
		int[] arr={1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			System.out.println(arr[i]);
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
