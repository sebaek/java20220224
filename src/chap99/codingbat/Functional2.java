package chap99.codingbat;

import java.util.List;

public class Functional2 {
	public List<String> noZ(List<String> strings) {
		strings.removeIf(e -> e.contains("z"));

		return strings;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(e -> e >= 13 && e <= 19);

		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf((e) -> e % 10 == 9);

		return nums;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(e -> e < 0);

		return nums;
	}

}
