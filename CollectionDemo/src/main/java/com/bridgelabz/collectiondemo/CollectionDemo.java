package com.bridgelabz.collectiondemo;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		listDemo();
		stackDemo();
		queueDemo();
		setDemo();
		mapDemo();

	}

	private static void mapDemo() {
		// TODO Auto-generated method stub
		
	}

	private static void setDemo() {
		// TODO Auto-generated method stub
		
	}

	private static void queueDemo() {
		System.out.println("Demonstrating queue");
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("lucifer");
		queue.add("John");
		queue.add("Ross");
		queue.add("Sheldon");
		System.out.println("head : "+queue.element());
		System.out.println("head : "+queue.peek());
		java.util.Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		java.util.Iterator<String> itr2 = queue.iterator();
		System.out.println("queue after removing two elements");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("---------------------");
		
		
	}

	private static void stackDemo() {
		System.out.println("Demonstrating stack");
		Stack<String> stack = new Stack<>();
		stack.push("Arya");
		stack.push("Raj");
		stack.push("Rob");
		stack.push("Jim");
		String pop = stack.pop();
		System.out.println("Popped element "+pop);
		java.util.Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		
	}

	private static void listDemo() {
		System.out.println("Demonstrating list");
		List<String> list = new LinkedList<>();
		list.add("Ram");
		list.add("Arjun");
		list.add("David");
		list.add("Juliet");
		java.util.Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------");
		
	}

}

