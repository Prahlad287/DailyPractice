package com.array;

import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {
		int arr[][]= {{5,6,7},{1,2,3},{7,8,9}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		int newarr[][]=new int[arr.length][arr[0].length];
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				newarr[j][i]=arr[i][j];
			}
		}
		System.out.println();
		for (int[] is : newarr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********************************");
		
		 int[][][] threeDArray = {
		            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
		            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
		            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
		        };

		       
		        for (int i = 0; i < threeDArray.length; i++) {
		            for (int j = 0; j < threeDArray[i].length; j++) {
		                for (int k = 0; k < threeDArray[i][j].length; k++) {
		                    System.out.print(threeDArray[i][j][k] + " ");
		                }
		                System.out.println(); // Move to the next line after each row
		            }
		            System.out.println(); // Separate each 2D array with an empty line
		        }
		        
		        int [][][]Three=new int[threeDArray.length][threeDArray[0].length][threeDArray[0][0].length];
		        
		        for(int i=0;i<threeDArray.length;i++) {
		        	for(int j=0;j<threeDArray[0].length;j++) {
		        		for(int k=0;k<threeDArray[0][0].length;k++) {
		        			Three[k][j][i]=threeDArray[i][j][k];
		        		}
		        	}
		        }
		        
		        
		        for (int[][] is : Three) {
					for(int [] is2 :is){
						for(int is3:is2) {
							System.out.print(is3+" ");
						}System.out.println();
					}
					System.out.println();
				}
	}

}
