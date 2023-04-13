package Chap0402;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class excersise08 {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 DD일 mm분 ss초"));
		System.out.println(formatedNow);
		
		DecimalFormat decFormat = new DecimalFormat("###,###");
		
		int price = 180000;

		System.out.println("\t매출전표(카드회사용)");
		System.out.println("맛꼬방치킨 \t\t  하순희");
		System.out.println("124-25-54620 \t 063-632-6614");
		System.out.println("전북 남원시 농고길 11(도봉동)");
		System.out.println();
		System.out.println("하나기업카드\t      신용승인(1)");
		System.out.println("거래일시:" + formatedNow);
		System.out.println("4336-9200-****-982*\t일시불");
		System.out.println("[ID:****13440\t230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매 입 사 하나카드(다우테이타)");
		System.out.println("승인번호 40860059");
		System.out.println();

		System.out.println("판매금액:\t" +  decFormat.format(Math.round(price / 1.1)) + "원");
		System.out.println("부 가 세:" +  decFormat.format(Math.floor(price * 0.09091)) + "원");
		System.out.println("합  계:\t" +  decFormat.format(price) + "원");

	}

}
