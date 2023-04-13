package Chap03;

public class TypeConversion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		double y = 3.0;

		System.out.println(x / y); // 더블형이 있기에 소수점 자리까지 표현 
		System.out.println(x / (int) y); // 정수형 캐스팅 때문에 .0실추
		System.out.println((int) x / y); // 두 결과값을 정수형으로 캐스팅 했기에 .0실추

	}

}
