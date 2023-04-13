package Homework0412;

public class homework07 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i ++) //for문으로 10번 반복할 예정
		{
			sum = sum +1; // 1회 실행할 때 마다 +1 
		}
		System.out.println("sum:" + sum);
		for(int i = 1; i < 10; i++) // for문으로 9번 반복할 예정
		{
			System.out.println("**********");
			System.out.println("구구단"+i+"단"); // 구구단 1단부터 시작 / 총 9단
			System.out.println("**********");
			for(int j = 1; j <10; j++)
			{
				System.out.println(i + "*" + j + "=" + i *j); 
				// i는 1부터 시작(1단을 나타냄) j도 1부터시작 그러나 위의 내부for문이 j이므로
				// i가 1증하갈때 j는 9증가 >> 그리고 이것을 연산식으로 i*j해주면 구구단 완성
			}
		}
		
	}

}
