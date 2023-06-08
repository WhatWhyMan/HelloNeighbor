package com.kh.practice.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// SWAP
		// a 방에 b값으로 바꾸고, b방에 a값으로 바꾸기.
		
		int temp = a;
		a = b;
		b = temp;
		
//		System.out.println(a);	// 20
//		System.out.println(b);	// 10
		
		// 버블정렬
		int[] arr = new int[] {3, 2, 5, 1, 6, 8};
		// 배열 ==> List로 변경
		System.out.print("[");
		for(int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {		//오름차순
//				if(arr[j] < arr[j+1]) {		//내림차순
					// Swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
			}
		}
		System.out.print("[");
		for(int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		
		// 버블정렬
				String[] nameArr = new String[] {"손범규", "천영준", "유청하", "김민성"};
				// 배열 ==> List로 변경
				System.out.print("[");
				for(String ar : nameArr) {
					System.out.print(ar);
					System.out.print(",");
				}
				System.out.println("]");
				for(int i=0; i<nameArr.length-1; i++) {
					for(int j=0; j<nameArr.length-1-i; j++) {
//						if(nameArr[j].compareTo(nameArr[j+1]) > 0) {		//오름차순
						if(nameArr[j].compareTo(nameArr[j+1]) < 0) {		//내림차순
							// Swap
							String tmp = nameArr[j];
							nameArr[j] = nameArr[j+1];
							nameArr[j+1] = tmp;
						}
					}
				}
				System.out.print("[");
				for(String ar : nameArr) {
					System.out.print(ar);
					System.out.print(",");
				}
				System.out.println("]");
	}
}
