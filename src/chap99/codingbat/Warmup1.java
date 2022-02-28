package chap99.codingbat;

public class Warmup1 {
	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
