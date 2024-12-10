package practice.algo.arrays;

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
		boolean firstRow = false;
		boolean firstCol = false;
		int row = matrix.length, col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			if (matrix[i][0] == 0) {
				firstRow = true;
				break;
			}
		}
		for (int j = 0; j < col; j++) {
			if (matrix[0][j] == 0) {
				firstCol = true;
				break;
			}
		}

		// 3. Search the remaining matrix and mark zero their corresponding rows and
		// columns
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		// 4. Reverse method
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		// 2. Make the entire first row and column as zero and search in remaining
		// matrix [n-1][n-1]
		if (firstRow) {
			for (int i = 0; i < row; i++) {
				matrix[i][0] = 0;
			}
		}
		if (firstCol) {
			for (int j = 0; j < col; j++) {
				matrix[0][j] = 0;
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
