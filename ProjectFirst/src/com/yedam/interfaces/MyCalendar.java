package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.set(2020,3,1);
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020, 12);
	}

	public static void showCal(int year, int month) {
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		System.out.println("         [" + year + "년" + month + "월]");
		String[] week = { "  Sun ", "Mon ", "Tue ", "Wed " , "Thr ", "Fri ", "Sat \n " };
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%4d", today); // ex) "%3d" : 숫자 = d , 문자는 = s , 공백을 만들어준다.
			if ((today + dayOfWeek - 1) % 7 == 0)
				System.out.println();
			today++;
		}
	}

	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	public static int getLastDay(int year, int month) {
		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31; // 1 3 5 7 8 10 12
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				lastDay = 29;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}   
}
