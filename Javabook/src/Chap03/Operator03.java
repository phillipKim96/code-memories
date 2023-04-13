package Chap03;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10;

		System.out.println(a > b); // false
		System.out.println(!(a > b)); // false에 not = true
		System.out.println((a == b && (a == 5))); // 두 연산자 중 하나만 true 근데 &연산자 이기 때문에 false
		System.out.println((a != b) && (a == 5)); //두 연산자 모두 true이기 때문에 true
		System.out.println(!((a != b) && (a == 5))); // 두 연산자 모두 true이지만 not연산자에 묶여있어서 false

	}

}
