package practice.algo.arrays;

public class PascalTriangleReturnElementAtGivenPositionBrute {
	public static void main(String[] args) {
		int row = 7, col = 4; // nCr formula n for row and r for column
		int ans = fact(row) / ((fact(row - col)) * fact(col));
		System.out.println(ans);
	}

	static int fact(int num) {
		int ans = 1;
		while (num != 0) {
			ans = ans * num;
			num--;
		}
		return ans;
	}
}
