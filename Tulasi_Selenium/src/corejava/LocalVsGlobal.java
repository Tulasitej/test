package corejava;

public class LocalVsGlobal {
		
//		Variables:
//			1.Global Variables
//			2.Local Variables
	
//	1.Global Variables: Variables that are declared outside the method are called GV
	
	static int a = 60;
	static int b = 90;

	public static void add() {

//		2.Local Variables: Variables that are declared within the method are called LV
		
		int a = 20;
		int b = 50;
		int c = a + b;
		System.out.println(c);
	}

	public static void sub() {
		
//		2.Local Variables: Variables that are declared within the method are called LV
		
		//int a = 120; // Now Global variable is taken as a
		int b = 40;
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
		sub();

	}

}
