package Chap03;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.14;
		long l = (long) d;
		int i = (int) l; 
		System.out.println(d); //실수형 출력
		System.out.println(l); // long형이기에 뒤에 .0 없어짐
		System.out.println(i); // 마찬가지로 정수형이기에 .0없어짐

	}

}
