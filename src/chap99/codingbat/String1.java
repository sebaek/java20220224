package chap99.codingbat;

public class String1 {
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}
}
