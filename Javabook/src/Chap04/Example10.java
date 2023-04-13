package Chap04;

public class Example10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) // 10번 반복
		{
			System.out.println("구구단" + i + "단");

			for (int j = 1; j <= 10; j++) // 먼저 10번 반복 즉 i값은 고정이고 j의 값이 10번 늘어남 그후 위로 올라가서 다시 시작
			{
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}
}
