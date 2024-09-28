package com.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertSetIntoArrayList {
	public  static void main(String[] args) {
		
		//declaration
		
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(30);
		h1.add(22);
		h1.add(56);
		h1.add(42);
		System.out.println("set="+h1);
		
		ArrayList<Integer> a1=new ArrayList<>(h1);
		System.out.println("ArrayList="+a1);
		a1.add(20);
		a1.add(30);
		
		//sort
		Collections.sort(a1);
		System.out.println("After sorting="+a1);
		
	}

}
