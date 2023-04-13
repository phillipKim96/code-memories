package Chap0402;

public class excercise04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3;i++) {
			System.out.println("**********************************************");
			System.out.println("구구단" + i + "단\t"+ "\t" +"구구단" + (i+3) + "단\t" + "\t" + "구구단" + (i+6) + "단\t" );
			System.out.println("**********************************************");
			
			
			for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j)+("\t")+(i+3) + " * " + j + " = " + ((i+3) * j)+("\t")+(i+6) + " * " + j + " = " + ((i+6) * j));
			}
			
		}
	}
			
}
	