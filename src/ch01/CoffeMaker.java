package ch01;

// 싱글톤 패턴으로 만들어 보기
public class CoffeMaker {

	// 1. 외부에서 생성자를 바로 호출 할 수 없게 설계 한다.
	private CoffeMaker() {
		
	}
	
	// 2. 자신의 참조 값을 저장할 수 있는 static 변수를 선언 한다.
	private static CoffeMaker instance;
	
	// 3. 객체를 메모리에 올릴 코드 작성 후. 외부에서 접근 가능한 메서드를 만들어 준다. 
	// 단 정적 메서드로 작성해야 한다. 왜냐하면 CoffeMaker() {} 를 new 할수 없으니 클래스 이름 메서드로 접근 가능한게 정적 메서드
	
	public static synchronized CoffeMaker getInstance() {
		// instance가 비어있다면 한번 은 메모리에 띄워주고 없다면 바로 그대로 리턴
		if(instance == null) {
			instance = new CoffeMaker();
		}
		return instance;
	}
	/* 멀티 스레드 프로그램이라 동기화 처리를 필요할 경우 synchronized를 사용
	   이때 이 메서드를 락한다고 표현 하는데 1번 스레드가 접근 하는 중에
	   (getInstance가 10초 돈다가정) 2번이 접근 하면 cpu가 2번으로 갈고 연산도중 끼어들어 값을 바꾸기 때문에 결과가 자꾸 바뀜 
	*/ 
	
	public void makeCoffe() {
		System.out.println("커피가 만들어 졌습니다.");
	}
	
}
