package corejava;

public class MethodSample {
	
	public static void add() {
		
		int a = 20;
		int b = 90;
		int c;
		c = a+b;
		
		System.out.println("Addition is : "+c);
		
	}
	
public static void sub() {
		
		int a = 20;
		int b = 90;
		int d;
		d = a-b;
		
		System.out.println("Substraction is : "+d);
		
	}

	public static void main(String[] args) {
		
		
		 System.out.println("Main method");
		 
		 //METHOD CALLING
		 add();
		 sub();
		 // To maximize and minimize the screen use ctrl+m
		 
	}

}
