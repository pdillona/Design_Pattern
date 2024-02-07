package ch03;

// 어댑터 클래스 만들기
// 1. 먼저 기존에 사용하는 스펙을 구현해 준다.
public class ElectronicAdapter implements IElectronic220v{

	// 2. 변환 하고자 하는 스펙을 포함 관계로 만들어 준다.
	private IElectronic110v iElectronic110v;
	
	
	// 3. 생성자 주입을 통해서 의존 주입을 받을 수 있도록 설계 한다. (null포인트가 안뜨게 하려고)
	// 생성자 만이 아닌 메서드로도 의존 주입을 받는 것이 가능하다. 해당 메서드가 그에 해당.
	public ElectronicAdapter(IElectronic110v electronic110v) {
		this.iElectronic110v = electronic110v;
	}
	
	@Override
	public void connect() {

		// 4. 호환 처리
		// 외부에서는 connect()
		iElectronic110v.connect();
	}

	
}
