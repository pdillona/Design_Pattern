package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 싱글톤 패턴으로 로그를 찍는 객체 생성해 보기
public class LogWriter {


	// 2단계
	// 파일 생성 해서 --> 시간 찍어보기.
	private static BufferedWriter bufferedWriter;
	private static LogWriter instance;
	
	
	
	// 1단계 butteredWriter new 설정
	// 생성자 호출시 bufferedWriter로 log파일 생성 하게 해주기
	private LogWriter() {
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("log.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
	// 3단계
	public static LogWriter getInstance() {
		
		if(instance == null) {
			instance = new LogWriter();
		}
		
		return instance;
	}
	
	
	// 기능 
	public void writeLog(String log) {
		// 파일에다 글을 작성 하는 기능 만들기
		try {
			bufferedWriter.write(log);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
