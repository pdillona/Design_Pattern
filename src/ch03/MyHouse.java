package ch03;

// 어댑터 패턴
public class MyHouse {

	//전기 연결
	public static void homeConnect(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
		
	}
	
	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		
		// 전기 연결 동작
		homeConnect(airConditioner); //정적 메서드는 문자가 기울어짐? (이텔릭체?)
		//homeConnect(hairDryer);  //스펙이 달라서 연결 불가 에러뜸 The method homeConnect(IElectronic220v) in the type MyHouse is not applicable for the arguments (HairDryer) 이를 해결 하기 위해 adapter가 필요하다.
		
		// 철물점 가서 어댑터 클래스를 구해오자
		ElectronicAdapter hairDryerAdapter = new ElectronicAdapter(hairDryer);
		homeConnect(hairDryerAdapter);
		
		ElectronicAdapter cleanerAdapter = new ElectronicAdapter(cleaner);
		homeConnect(cleanerAdapter);
		
	}
}
