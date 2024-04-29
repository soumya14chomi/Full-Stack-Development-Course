package com.test;

import java.util.Arrays;

public class Test {
	public static int findMissing(int[] arr) {
		int[] count = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >0 && arr[i]<= arr.length) {
				count[arr[i]]++;
			}
		}
		int res = arr.length+1;
		for(int i=1;i<arr.length+1;i++) {
			if(count[i] == 0) {
				res= i;
				break;
			}
		}
		return res;
	}
	public static int[][] matrixMultiplication(int[][] arr1, int[][] arr2){
		int n=arr1.length, m=arr2[0].length, p = arr1[0].length;
		int[][] res = new int[n][m];
		if(arr1[0].length!=arr2.length)	return res;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<p;k++) {

					//System.out.println(n+" "+m+" "+p+" "+arr2.length);
					res[i][j]+=(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {5,3,-1,4,1,7,2};
		System.out.println(findMissing(arr));
		int[][] arr1 = {{1, 2, 3},{2, 3, 4}, {3, 4, 5}};
		int[][] arr2 = {{2, 3, 4}, {3, 4, 5},{4, 5, 6}};
		int[][] res = matrixMultiplication(arr1, arr2);
		for(int i=0;i<res.length;i++) {
			System.out.println(Arrays.toString(res[i]));
		}
 	}
}
