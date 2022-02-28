package chap99.codingbat;

public class Logic1 {
	public boolean cigarParty(int cigars, boolean isWeekend) {

		if (isWeekend) {
			return cigars >= 40;
		} else {
			return cigars >= 40 && cigars <= 60;
		}

	}

}
