package ch03;

public class Cleaner implements IElectronic110v{

	
	@Override
	public void connect() {

		System.out.println("청소기 연결 110v ON");
	}

	

}
