package com.HashSet;

import java.util.HashSet;

public class HashSetString {
	public static void main(String[] args) {
		
		//create a hashSet of String
		HashSet<String> set1=new HashSet<>();
		set1.add("Monday");
		set1.add("Tuesday");
		set1.add("Wedneshday");
		set1.add("Thusday");
		set1.add("Friday");
		set1.add("Saturday");
		set1.add("Sunday");
		System.out.println("set1="+set1);
		
		HashSet<String> set2=new HashSet<>();
		set2.add("Jan");
		set2.add("Feb");
		set2.add("Mar");
		set2.add("Apr");
		set2.add("May");
		set2.add("jun");
		set2.add("jul");
		set2.add("Aug");
		set2.add("Sep");
		set2.add("Oct");
		set2.add("Nov");
		set2.add("Dec");
		System.out.println("set2="+set2);
		
		// Union using addAll
        set1.addAll(set2);
        System.out.println("Union of set1 and set2 = " + set1);
        
        // Retain common elements
        set1.retainAll(set2);
        System.out.println("Common elements (intersection) = " + set1);
		
        // Uncommon elements (difference)
        set1.removeAll(set2);
        System.out.println("Difference (elements in set1 but not in set2) = " + set1);
	}

}
