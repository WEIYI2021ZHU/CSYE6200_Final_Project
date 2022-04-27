package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtility {
	public static int stringConvertInt(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public static double stringConvertDouble(String s) {
		double d = 0;
		try {
			d = Double.parseDouble(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	public static Date stringConvertDate(String s) throws ParseException {
	  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	  Date date = sdf.parse(s);
	  return date;			
	}
}
