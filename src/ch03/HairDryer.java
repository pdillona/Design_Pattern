package ch03;

// 일본에서 선물 받아서 전력이 다르다고 가정
// 추상클래스가 되거나 implements 받은 클래스의 메서드를 구현하거나(오버라이드)
public class HairDryer implements IElectronic110v{

	@Override
	public void connect() {

		System.out.println("헤어 드라이기 연결 110v ON");
	}

}
