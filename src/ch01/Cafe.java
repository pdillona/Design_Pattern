package ch01;

import java.text.SimpleDateFormat;
import java.util.Date;

// 싱글톤 패턴 예제
public class Cafe {

	public static void main(String[] args) {
		// 커피 메이커 인스턴스를 얻어서 커피를 만들게 동작 시키기
		
		System.out.println("세상에서 가장 작은 카페 오픈");
		
		// 커피 메이커 인스턴스 호출
		CoffeMaker coffeMaker1 = CoffeMaker.getInstance();
		coffeMaker1.makeCoffe();
		
		CoffeMaker coffeMaker2 = CoffeMaker.getInstance();
		
		System.out.println("주소값 비교: " + (coffeMaker1 == coffeMaker2));
		// ioc가 싱글톤으로 객체 관리 하듯이 싱글톤으로 관리하면 heap에 같은 주소에서 인스턴스를 공유한다. 
		// 만약 여러 개발자가 새로 new해서 사용하면 상태 값이 변할 수 있기 때문에 같은 주소를 가지고 사용한다.
		
		LogWriter.getInstance().writeLog("커피 결제 완료! : " + dataFormatter(new Date()) );
		
	}
	
	// 시간 포멧 기능
	public static String dataFormatter(Date date) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
		return dateFormat.format(date);
	}
	
}
