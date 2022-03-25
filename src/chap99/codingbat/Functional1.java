package chap99.codingbat;

import java.util.List;

public class Functional1 {
	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(e -> e % 10);

		return nums;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(e -> (e + 1) * 10);

		return nums;
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(a -> "y" + a + "y");

		return strings;
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(a -> {
			String result = "";
			for (int i = 0; i < 3; i++) {
				result += a;
			}

			return result;
		});

		return strings;
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(s -> s + "*");

		return strings;
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(a -> a * a);

		return nums;
	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(a -> a * 2);

		return nums;
	}
}
