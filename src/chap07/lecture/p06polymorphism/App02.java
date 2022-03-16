package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App02 {
	public static void main(String[] args) {
		Animal animal1 = new Chihuahua();
		Animal animal2 = new StreetCat();
		
		animal1.breathe();
		animal2.breathe();
		
		animal1.cry();
		animal2.cry();
	}
}
