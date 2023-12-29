package com.enum1.practice1;

import com.enum1.practice1.EnumClass.Season;

public enum Day {
	MONDAY(9), TUESDAY(10), WEDNESDAY(20), THRUSDAY(90), FRIDAY(70), STAURDAY(8), SUNDAY;

	private int value;

	private Day(int value) {
		this.value = value;
	}

	Day() {
	
	}

	public static void main(String[] args) {

		Day day = Day.FRIDAY;
		System.out.println(day);
		for (Day s : Day.values()) {
			System.out.println(s + " " + s.value);
		}
		for (int i = 0; i < Day.values().length; i++) {
			System.out.println("Position " + i + " value" + Day.values()[i] + " value :" + Day.values()[i].value+" index :" + Day.values()[i].ordinal());
		}

	}
}
