package Chap03;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10, c = 10, d = 10;
		System.out.println("a++=>" + (a++)); // a=10이기 때문에 >=에 부합함
		System.out.println("a=>" + a); // a=11이기 때문에
		System.out.println("++b=>" + (++b)); // ++는 먼저 1을 더해줌
		System.out.println("c--=>" + (c--)); // 나중에 -1이기 때문에 값은 10그대로
		System.out.println("--d=>" + (--d)); // --는 먼저 1 빼주기 떄문에 값은9

	}

}
