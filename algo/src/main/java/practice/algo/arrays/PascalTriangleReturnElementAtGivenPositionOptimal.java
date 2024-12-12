package practice.algo.arrays;

public class PascalTriangleReturnElementAtGivenPositionOptimal {
	public static void main(String[] args) {
		int row = 7, col = 4; // nCr formula n for row and r for column
		int ans = optimizedNcr(row, col);
		System.out.println(ans);
	}

	static int optimizedNcr(int row, int col) {
		int ans = 1;
		for(int i=0; i<col; i++) {
			ans = ans * (row - i);
			ans = ans / (i + 1);
		}
		return ans;
	}
}
