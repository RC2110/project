package com.tcs;

import java.util.Arrays;
import java.util.List;

public class ClassA {
	
	public static void main(String[] args) {
		
		//1
		int a[] = new int[4];
		a[0]=5;
		a[1]=23;
		
		//2
		int b[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		//3
		String[] c = {"as", "sds"};
		
		int d[][]= new int[2][2];
		d[0][0]= 1;
		d[0][1]= 3;
		d[1][0]= 5;
		d[1][1]= 7;
		
		int e [][]= new int [][]{{1,5},{4,6}};
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				System.out.println(e[i][j]);
			}
		}
		
		int[][] f= {{11,22,45},{33,44,343}};
		
		
		List<int[]> asList2 = Arrays.asList(f);
		System.out.println(asList2);
		for (int i = 0; i < asList2.size(); i++) {
			int[] js = asList2.get(i);			
			System.out.println(js[i]);
		}
		
		int[]p= {4,5,6};
		List<int[]> asList = Arrays.asList(p);
		int[] is = asList.get(0);
		System.out.println(is[0]);
//		is[0]
//		System.out.println(asList);
		
	}

}