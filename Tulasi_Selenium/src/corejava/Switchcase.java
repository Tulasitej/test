package corejava;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner : User will give some input value to the console
		
		int weekday = 0;
		switch (weekday) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Please type weekday numbers 1-7 only");
			break;
		}

	}

}
