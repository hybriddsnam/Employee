package webapp.main;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import webapp.escape.Screen;

public class CalendarTest {

	public static void printCalendar(int year, int month) {
		Screen.cursorPosition(3, 5);
		System.out.println("year = " + year + ", month = " + month);
		Date date = new Date();
		int years = date.getYear();
		int months = date.getMonth();
		int day = date.getDate();

		while (true) {
			date.setDate(date.getDate() + 1);

			if (months != date.getMonth())
				break;
		}
		System.out.println("month = " + date.getMonth());
		date.setDate(date.getDate() - 1);
		for (int i = 1; i <= date.getDate(); i++) {
			System.out.print(i + " ");
			if ((i % 7) == 0)
				System.out.println();
		}

	}

	public static void main(String[] args) {
		Screen.clear();

		Scanner scan = new Scanner(System.in);

		System.out.println("sun mon tue wed thu fri sat");
		
		while (true) {

			boolean flag = true;
			String param = "";
			do {
				flag = true;
				Screen.cursorPosition(20, 1);
				System.out.print("[yyyy/MM] : ");
				param = scan.nextLine();
				Screen.clear();
				System.out.println("param = " + param);

				// param.matches("[1-9][0-9][0-9][0-9]/[0-9][0-9]");
				flag = param.matches("[1-9][0-9]{3}/[0-1][0-9]");

			} while (!flag);

			StringTokenizer tokens = new StringTokenizer(param, "/");

			int year =Integer.parseInt((String) tokens.nextElement());
			int month =	Integer.parseInt((String) tokens.nextElement());
			
			if(month > 0 && month < 13)
				printCalendar(year, month);
		}

	}
}
