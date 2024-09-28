package com.HashSet;

import java.util.HashSet;

public class HashSetInteger {
	public static void main(String[] args) {
		
		//create a HashSet of Integer
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		System.out.println("set1="+set1);
		
		HashSet<Integer> set2=new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("set2="+set2);
		
		//union addAll
		set1.addAll(set2);
		System.out.println("union of set1 and set2="+set1);
		
		//retainAll common
		/*set1.retainAll(set2);
		System.out.println("inseration="+set1);*/
		
		//uncommon
		set1.removeAll(set2);
		System.out.println("difference="+set1);
		
	}

}
