package Chap03;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 25;
		System.out.println("a==b =" + (a == b)); // 두 값이 같지 않음 false
		System.out.println("a!=b =" + (a != b)); // false에 not이 들어가서 true
		System.out.println("a>b =" + (a > b)); // a가 b보다 작기 때문에 flase
		System.out.println("a<b =" + (a < b)); // b가 a보다 크기 때문에 true
		System.out.println("b>=a =" + (b >= a)); // b가 a보다 크기 때문에 true
		System.out.println("b<=a =" + (b <= a)); // a가 b보다 작기 때문에 true

	}

}
