package chap10.lecture.p03checked;

import java.io.FileReader;

public class App05 {
	public static void main(String[] args) {
		// 하나 try블럭 사용
		// 여러 catch 블럭 사용
		// 컴파일 오류 해결
		
		FileReader fr = new FileReader("");
		fr.read();
	}
}
