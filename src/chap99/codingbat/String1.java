package chap99.codingbat;

public class String1 {
	public String nTwice(String str, int n) {
		String front = str.substring(0, n);
		String end = str.substring(str.length() - n);

		return front + end;
	}

	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}
}
