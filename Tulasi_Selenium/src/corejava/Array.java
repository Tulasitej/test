package corejava;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 90;
		String b = "Hi all";
    	//Array :  Array is an arrangement of numbers or objects in a row or column according to their types. 
		// it is a collection of items or data stored in a contagious memory.
		//[] Array
		
		int c[] = {10,20,34,5,4535473};
		//To print array value in console
		System.out.println(c[4]);
		//Array length
		System.out.println(c.length);
		
		String stuName[] = {"Tulasi","raji","ooha","Dhana"};
		System.out.println(stuName[0]);
		// Array length
		System.out.println(stuName.length);
		System.out.println("------------------------------");
		
		//To print all array values
		for (int i = 0; i<stuName.length; i++) {
		System.out.println(stuName[i]);
			
		}
		
		
		

	}

}
