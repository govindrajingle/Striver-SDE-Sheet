package practice.algo.arrays;

import java.util.Stack;

public class SetMatrixZerosBrute {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		// 1. Check any element is first row or column is zero then mark them completely
		// zeroes
		// Print the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
		Stack<int[]> temp = new Stack<>();
		int row = matrix.length, col = matrix[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(matrix[i][j] == 0) {
					temp.push(new int[] {i, j});
				}
			}
		}
		while(!temp.isEmpty()) {
			int [] zero = temp.pop();
			int rz = zero[0];
			int cz = zero[1];
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					matrix[rz][0] = 0;
					matrix[0][cz] = 0;
				}
			}
		}
		// Print the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
	}
}
