package Homework0411;

public class homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.println("x와 y의 값을 확인합니다.");
		System.out.println("x값:"+ x);
		System.out.println("y값"+ y + "\n");
		
		
		temp = x;
		x = y;
		y = temp;
		
		
		System.out.println("x와 y의 값을 변경합니다.");
		System.out.println("x값:"+ x);
		System.out.println("y값"+ y + "\n");

	}

}
