package java8features;

import java.util.Arrays;

import Array.ArrayPositive;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {23,12,56,8,29,15,3,42,11,9};
		
		System.out.print("Before sorting ");
		for (int i : a) {
			
			System.out.println(i+" ");
		}
		//Arrays.parallelSort(a);
		Arrays.parallelSort(a,0,6);
		
		System.out.print("\nAfter sorting ");
		for (int i : a) {
			
			System.out.println(i+" ");
		}
	}

}
