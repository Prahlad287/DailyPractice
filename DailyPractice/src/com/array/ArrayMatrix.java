package com.array;

public class ArrayMatrix {

	public static void main(String[] args) {
//		Copy code
//		1  2  3
//		4  5  6
//		7  8  9
//
//		The transposed matrix would be:
//		1  4  7                                                                                        
//		2  5  8
//		3  6  9
		int [][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]transposed=new int[matrix.length][matrix[0].length];
		for (int[] is : matrix) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		int row=matrix.length;
		int column=matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				transposed[j][i]=matrix[i][j];
			}
		}
		
		for (int[] is : transposed) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		if (System.out.append("ehllo")==null) {
			
		}
	}

}
