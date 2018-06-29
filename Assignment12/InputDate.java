package movie;

import java.util.HashMap;
import java.util.Scanner;

public class InputDate 
{
        public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> yearL = new HashMap<String, String>();
	public static HashMap<String, String> yearR = new HashMap<String, String>();

	public static void genData() {
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Nineth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Tweleveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twent Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Nineth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		yearL.put("07", "Seven");
		yearL.put("08", "Eight");
		yearL.put("09", "Nine");
		yearL.put("10", "Ten");
		yearL.put("11", "Eleven");
		yearL.put("12", "Tweleve");
		yearL.put("13", "Thirteen");
		yearL.put("14", "Fourteen");
		yearL.put("15", "Fifteen");
		yearL.put("16", "Sixteen");
		yearL.put("17", "Seventeen");
		yearL.put("18", "Eighteen");
		yearL.put("19", "Nineteen");
		yearL.put("20", "Two Thousand");
		yearL.put("21", "Twenty One");
		yearL.put("22", "Twenty Two");

		yearR.put("00", "Hundred");
		yearR.put("10", "Ten");
		yearR.put("20", "Twenty");
		yearR.put("30", "Thirty");
		yearR.put("40", "Forty");
		yearR.put("50", "Fifty");
		yearR.put("60", "Sixty");
		yearR.put("70", "Seventy");
		yearR.put("80", "Eighty");
		yearR.put("90", "Ninety");
                yearR.put("91", "Ninety One");
                yearR.put("92", "Ninety Two");
                yearR.put("93", "Ninety Three");
                yearR.put("94", "Ninety Four");
                yearR.put("95", "Ninety Five");
                yearR.put("96", "Ninety Six");
                yearR.put("97", "Ninety Seven");
                yearR.put("98", "Ninety Eight");
                yearR.put("99", "Ninety Nine");
                yearR.put("11", "Eleven");
                yearR.put("12", "Tweleve");
		yearR.put("13", "Thirteen");
		yearR.put("14", "Fourteen");
		yearR.put("15", "Fifteen");
		yearR.put("16", "Sixteen");
		yearR.put("17", "Seventeen");
		yearR.put("18", "Eighteen");
		yearR.put("19", "Nineteen");
		yearR.put("20", "Twenty");
		yearR.put("21", "Twenty One");
		yearR.put("22", "Twenty Two");
	}

	public static String convert(String dateInput) {
		String dd = dateInput.substring(0, 2);
		String mm = dateInput.substring(3, 5);
		String yL = dateInput.substring(6, 8);
		String yR = dateInput.substring(8, 10);
		return date.get(dd) + " " + month.get(mm) + " " + yearL.get(yL) + " " + yearR.get(yR);
	}

	public static void main(String args[]) {

		genData();
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Date in dd-mm-yyyy");
                String x=in.next();
		
		System.out.println(convert(x));


	}
    
}
