package com.enum1.practice1;

public class EnumClass {

	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL;

		private int value;

		private Season(int value) {
			this.value = value;
		}

		Season() {
			
		}
	}

	public static void main(String args[]) {
		for (Season s : Season.values())
			System.out.println(s + " " + s.value);

	}

}
