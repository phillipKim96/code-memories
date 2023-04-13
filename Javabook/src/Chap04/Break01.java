package Chap04;

public class Break01 {

	public static void main(String[] args) {
		for(int i =0; i <10 ; i++) { // 10번 반복
			if(i==5) //5에서 브레이크 
				break;
			System.out.println("i:"+i); // i가 0~5까지 증가함으로 5번 찍힘 
		}
	}

}
