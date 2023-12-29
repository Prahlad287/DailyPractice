package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

 class CustomException extends Exception {

   

    public CustomException(String message) {
        super(message);
    }

}

public class CopyArrayListExample {
	static void copyonwriteArrayList() throws InterruptedException {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			Thread.sleep(1000);
			list.add("HellO");
		}
		System.out.println(list);
	}

	static void copyArraySet() throws InterruptedException {
		CopyOnWriteArraySet list = new CopyOnWriteArraySet();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			Thread.sleep(1000);
			list.add("HellO");
			list.add("HellO");
			list.add("Prahlad");
		}
		System.out.println(list);
	}

	public static void main(String[] args) throws   InterruptedException, CustomException {
//		 copyonwriteArrayList();
//			copyArraySet();
			
		System.out.println("Fail Fast");
		ArrayList list1=new ArrayList();
		list1.add("Hello");
		list1.add("Ram");
		
		Iterator itr=list1.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
			
			
				if (list1.add("Prahlad")) {
		throw new CustomException("This is fail fast Exception Use CopyOnWriteArrayList ");
				
				}
			
			
		}
		System.out.println(list1);
		
	}
}
