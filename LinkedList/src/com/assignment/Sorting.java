package com.assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int sum=0;
		int add =0;
		System.out.println("enter the numbers");
		
		Scanner scanner = new Scanner(System.in);
		
		int arr[]=new int[25];
		
		for(int i=1;i<25;i++)
		{
	        arr[i]=scanner.nextInt();
	        
	        ll.add(arr[i]);
			

	    }
			
			
			
		
		Collections.sort(ll);
		for(int i:ll)
		{
			System.out.println("after sorting:"+i);
			add=add+i;
		}
		
		System.out.println("the sum of 25 nubers is :"+add);
		System.out.println("the avergae is:"+add/25);

	}

}
