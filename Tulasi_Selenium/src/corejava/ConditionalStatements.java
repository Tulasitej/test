package corejava;

public class ConditionalStatements {
	
//	Conditional Statemets:
//		1. if
//		2. if else
//		3. else if
//		4. nested if

	public static void main(String[] args) {
		
		//DEBUGGING : Step by step process of execution process to know how program is executed
		
		int a = 123;
		int b = 304;
		System.out.println("Before if else contion");
		if (a > b) {
			System.out.println("if condition is executed");
			System.out.println("a is larger");
		} else if (b > a) {
			System.out.println("else condition is executed");
			System.out.println("b is larger");
		} else {
			System.out.println("Both are equal");
		}
//		Nested if condition: Condition within condition
//		if (condition) {
//			if (condition) {
//
//			} else {
//
//			}
//
//		} else {
//
//		}
//		
		
		System.out.println("After if else condition");
	}

}


