package chap99.codingbat;

public class Logic1 {
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			return temp >= 60 && temp <= 100;
		} else {
			return temp >= 60 && temp <= 90;
		}
	}

	public int dateFashion(int you, int date) {
		int result = 1;

		if (you >= 8 || date >= 8) {
			result = 2;
		}

		if (you <= 2 || date <= 2) {
			result = 0;
		}

		return result;

	}

	public boolean cigarParty(int cigars, boolean isWeekend) {

		if (isWeekend) {
			return cigars >= 40;
		} else {
			return cigars >= 40 && cigars <= 60;
		}

	}

}
