package chap05.lecture.array;

public class C07Array {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 5 }, { -2, -7 }, { 10, 30 } };
		int[][] arr2 = arr1;

		arr1[0][1] = 50;
		
		System.out.println(arr2[0][1]);
	}
}
