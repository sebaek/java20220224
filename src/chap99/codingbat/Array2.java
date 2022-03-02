package chap99.codingbat;

public class Array2 {
	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}

			if (min > nums[i]) {
				min = nums[i];
			}
		}

		return max - min;
	}

	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		}

		return cnt;
	}

}
