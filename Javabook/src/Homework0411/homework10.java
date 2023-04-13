package Homework0411;

public class homework10 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // y=5+10=15 - 2 = 13
		System.out.println(!('A' <= c && c <= 'Z')); // 'A' <= c='A' / true && 'A' <= 'Z' true / ! not =fales
		System.out.println('C' - c); // 67 - 65 = 2
		System.out.println(c++); // 'A'
		System.out.println(c); // 위에서 c++이 작동 했음으로 'B'
		System.out.println(++c); // 앞에서 ++c가 작동 함으로 'C'

	}

}
