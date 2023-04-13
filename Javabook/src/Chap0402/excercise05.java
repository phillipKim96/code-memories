package Chap0402;

public class excercise05 {

	public static void main(String[] args) {
		int val;
		
		for(int i = 0; i < 300; i++) { //300번 반복할 예정
			val = 5*i;
			if(val >=0 && val < 10) System.out.println("일"+val); // var이 0보다 크고 10보다 작을때 해당 내용 출력 : 일의자리
			else if(val >= 10 && val < 100) System.out.println("십"+val); // var이 10보다 크고 100보다 작을때 : 십의자리
			else if(val >= 100 && val < 1000) System.out.println("백"+val); // var 100보다 크고 1000보다 작을때 : 백의자리
			else System.out.println("천"+val);  // : 천의자리
		}
		
		
		
	}

}
