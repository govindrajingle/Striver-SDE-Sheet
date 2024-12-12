package practice.algo.arrays;

public class PascalTriangleGivenRowNPrintAllElementsBrute {
	public static void main(String[] args) {
		int n = 8; // row number
		pascalTriangle(n);
	}

	static void pascalTriangle(int n) {
		for (int c = 1; c <= n; c++) {
			// n is row and c is column
			System.out.print(nCr(n - 1, c - 1) + " ");
		}
		System.out.println();
	}

	static int nCr(int row, int col) {
		int res = 1;
		// optimal approach to calculate nCr
		for (int i = 0; i < col; i++) {
			res = res * (row - i);
			res = res / (i + 1);
		}
		return res;
	}
}
