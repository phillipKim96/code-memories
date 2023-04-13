package Chap04;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 3 && j == 2) {
					continue; //continue문만 제외하고 진행함
				}
				System.out.println(i + "*" + j); 
			}
		}
	}

}
