package corejava;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateTime {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d);
		
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHMMss EEEE");
		//To convert the system date to user define format
		System.out.println(df.format(d));
		
		//EEEE : Current Weekday names
		//MMMM : Current Month Names
			
	}

}
