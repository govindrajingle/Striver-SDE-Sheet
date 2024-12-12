package practice.algo.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePrintAllElementsToNOptimal {
	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> ans = pascalTriangle(n);
		for (List<Integer> it : ans) {
			for (int ele : it) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}

	static List<List<Integer>> pascalTriangle(int n) {
		List<List<Integer>> ans = new ArrayList<>();
		// store entire pascal triangle
		for (int row = 1; row <= n; row++) {
			ans.add(generateRow(row));
		}
		return ans;
	}

	static List<Integer> generateRow(int row) {
		long ans = 1;
		List<Integer> ansRow = new ArrayList<>();
		ansRow.add(1);
		// calculate rest of rows (elements)
		for (int col = 1; col < row; col++) {
			ans = ans * (row - col);
			ans = ans / col;
			ansRow.add((int) ans);
		}
		return ansRow;
	}
}
