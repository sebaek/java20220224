package chap07.lecture.p05promotion;

public class App06 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		StreetCat streetCat = new StreetCat();
		
		Canine canine = chihuahua;
		Feline feline = streetCat;
		
		Animal animal1 = canine;
		Animal animal2 = feline;
		
		Animal animal3 = chihuahua;
		Animal animal4 = streetCat;
	}
}
