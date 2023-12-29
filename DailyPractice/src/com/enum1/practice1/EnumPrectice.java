package com.enum1.practice1;

public class EnumPrectice {
	
	enum day{ MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, STAURDAY, SUNDAY
	}

	public static void main(String[] args) {
			day[] d=day.values();
			
			for (day day2 : d) {
				System.out.println(day2);
			}
			System.out.println(day.valueOf("WEDNESDAY"));
			System.out.println(day.valueOf("WEDNESDAY").ordinal());
			

	}

}
