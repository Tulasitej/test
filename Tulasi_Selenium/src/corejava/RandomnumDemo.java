package corejava;

import java.util.Random;

public class RandomnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print any random number between 1 to 1000
		
		Random r = new Random();
		int a = r.nextInt(1000);
		System.out.println(a);

	}

}
