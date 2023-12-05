package com.daily;

public class First {
	public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        First first=new First();
        first.printArray(intArray);
      //  first.printArray(stringArray);
	}

}
