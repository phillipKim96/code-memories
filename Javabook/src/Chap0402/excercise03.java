package Chap0402;

public class excercise03 {


	public static void main(String[] args) {
		for (int i = 1; i <= 1; i++) // 10번 반복
		{
			System.out.println("*****************************");
			System.out.println("구구단" + i + "단\t" + "구구단"+ (i+1) + "단\t" + "구구단" + (i+2) +"단");
			System.out.println("*****************************");

			
			for (int j = 1; j <= 10; j++) // 먼저 10번 반복 즉 i값은 고정이고 j의 값이 10번 늘어남 그후 위로 올라가서 다시 시작
			{
				System.out.println(i + "*" + j + "=" + (i * j) + ("\t") + (i+1) + "*" + j + "=" + ((i+1) * j)+("\t")+ (i+2) + "*" + j + "=" + ((i+2) * j));
			}
			for (int k = 1; k <= 1; k++) // 10번 반복
			{
				System.out.println("*****************************");
				System.out.println("구구단" + (k+4) + "단\t" + "구구단"+ (k+5) + "단\t" + "구구단" + (k+6) +"단");
				System.out.println("*****************************");

				
				for (int y = 1; y <= 10; y++) // 먼저 10번 반복 즉 i값은 고정이고 j의 값이 10번 늘어남 그후 위로 올라가서 다시 시작
				{
					System.out.println((y) + "*" + y + "=" + (y * y) + ("\t") + (y+1) + "*" + y + "=" + ((y+1) * y)+("\t")+ (y+2) + "*" + y + "=" + ((i+2) * y));
				}
			
		}
		}
	}
}

