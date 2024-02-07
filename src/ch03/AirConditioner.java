package ch03;

public class AirConditioner implements IElectronic220v{

	@Override
	public void connect() {

		System.out.println("어어컨 연결 220v ON");
	}

}
