package chap99.codingbat;

public class Warmup1 {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
