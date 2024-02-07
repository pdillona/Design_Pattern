package ch02;


public class RobotClient {

	public static void main(String[] args) {

		
		// 몸통 추가 
		Robot robot = new Robot.Builder()
						.head("깡통 대가리")
						.arms("고철 팔")
						.legs("양철 다리")
						.builder();
		
		
		System.out.println(robot);
	}

}
