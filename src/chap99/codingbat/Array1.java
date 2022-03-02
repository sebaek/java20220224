package chap99.codingbat;

public class Array1 {
	public boolean sameFirstLast(int[] nums) {

		if (nums.length > 0) {
			return nums[0] == nums[nums.length - 1];
		}

		return false;

	}

	public boolean firstLast6(int[] nums) {

		return (nums[0] == 6) || (nums[nums.length - 1] == 6);
	}

}
