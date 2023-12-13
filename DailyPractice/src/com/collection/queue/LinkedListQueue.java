package com.collection.queue;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueue implements Comparable <LinkedListQueue>{
    private int id;
    private String name;
    public LinkedListQueue() {
		// TODO Auto-generated constructor stub
	}

    public LinkedListQueue(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    

    @Override
	public String toString() {
		return "LinkedListQueue [id=" + id + ", name=" + name + "]";
	}
   
    @Override
	public int compareTo(LinkedListQueue o) {
//    	if (this.id>o.id) {
//			return 1;
//		}else if (this.id<o.id) {
//			return -1;
//		}
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        queue.offer(10);
        queue.add(20);
        System.out.println(queue);

        queue.add(50);
        System.out.println(queue.peek());

        queue.add("Prahlad");
        System.out.println(queue);

     //   Comparator<LinkedListQueue> comparator = Comparator.comparing(LinkedListQueue::getName);
        

    //    Comparator<LinkedListQueue> comparator = Comparator.comparing(LinkedListQueue::getId);

        // Specify the generic type for PriorityQueue and pass the comparator
        PriorityQueue<LinkedListQueue> pQueue = new PriorityQueue<>();

       
        pQueue.offer(new LinkedListQueue(8, "Rajasthan"));
        pQueue.offer(new LinkedListQueue(2, "Bob"));
        pQueue.offer(new LinkedListQueue(5, "Ajmer"));
        pQueue.offer(new LinkedListQueue(9, "Jodhpur"));
        pQueue.offer(new LinkedListQueue(10, "Pali"));
//        while (!pQueue.isEmpty()) {
//			LinkedListQueue sq1=pQueue.remove();
//			System.out.println(sq1.id+" "+sq1.name);
//		}
       
        Iterator<LinkedListQueue> itr=pQueue.iterator();
        while (itr.hasNext()) {
			LinkedListQueue linkedListQueue = (LinkedListQueue) itr.next();
			System.out.println(linkedListQueue);
			
		}
//        pQueue.forEach(System.out::println);
        System.out.println(pQueue);
    }

	

	
}
