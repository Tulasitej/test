package corejava;

public class ForLoopSample {
	
//	Looping Statements:
//		1. For loop : to print code n no of times
//		2. While loop
//		3. do while
//		4. nested for loop
//		5. foreach / advance / enhanced for loop

	public static void main(String[] args) {  
		
//		To print 1 to 100 numbers
//		syntax : for(initialize the variable; condition; increment/decrement)
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
		}
		
//		To print alphabets
		
		for (char abc = 'a'; abc <= 'z'; abc++) {
			System.out.print(abc);
			System.out.print(" ");
			
		}

	}

}
