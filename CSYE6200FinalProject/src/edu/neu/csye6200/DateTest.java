package edu.neu.csye6200;

import java.text.ParseException;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		Date date = ConvertUtility.stringConvertDate("09/15/2021");
		System.out.println(date.toString());
	}

}
