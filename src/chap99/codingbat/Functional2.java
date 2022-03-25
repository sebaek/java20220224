package chap99.codingbat;

import java.util.List;

public class Functional2 {
	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf((e) -> e % 10 == 9);

		return nums;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(e -> e < 0);

		return nums;
	}

}
