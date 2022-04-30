package com.java8.consecpts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LembdaExp {
	public static void main(String args[]) {
		System.out.println("this is the class for lembda exp");
		 List<Integer> a=    new ArrayList();
		 a.add(12);
		 a.add(13);
		 a.add(16);
		 a.add(17);
		 a.add(18);
		 List<Integer> obj = a.stream().filter(i->i%2!=0).collect(Collectors.toList());
//		 System.out.println(obj);
		 funInterfaceForlembda  obj1 =()->{
				 System.out.println("Hello mukul ");
				return "Mukul is my name ";
			 
		 };
		
		String S= obj1.test();
		System.out.print(S);
	}
	
}
