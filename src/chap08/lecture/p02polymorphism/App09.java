package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App09 {
	public static void main(String[] args) {
		Pet pet1 = new Retriever();
		Pet pet2 = new Chihuahua();
		Pet pet3 = new Cat();
		
		pet1.sit();
		pet2.sit();
		pet3.sit();
	}
}
