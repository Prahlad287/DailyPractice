package com.enum1.practice1;

import java.security.PublicKey;
import java.util.Scanner;

import com.enum1.practice1.EnumPrectice.day;
interface Week{
	void show();
}
public class EnumWithInterface {
	
	public enum Day implements Week {
        MONDAY {
            public void show() {
                System.out.println("It's Monday!");
            }
        },
        SUNDAY {
            public void show() {
                System.out.println("It's Sunday!");
            }
        },
        FUNDAY;

        public void show() {
            // Default implementation or common behavior for other days
            System.out.println("It's a day of the week!");
        }
    }
	
		

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Day day=Day.valueOf(scanner.next());
		System.out.println(day.hashCode());
		Day.MONDAY.show();
		System.out.println(Day.MONDAY.hashCode());
		Day.SUNDAY.show();
		Day.FUNDAY.show();
		
	}

}
