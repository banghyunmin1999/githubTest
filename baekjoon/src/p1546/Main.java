package p1546;

import java.util.ArrayList;

import util.MockScanner;

public class Main {
	public static void main(String[] args) {
		
		//테스트 데이터 입력해주는것 나중에 완성시 삭제
		Object[] testData = {3, 40, 80, 60}; 
		MockScanner s = new MockScanner(testData);
		
//		Scanner s = new Scanner(System.in);//완성시 활성
		
		int M = s.nextInt();
		ArrayList<Integer> intList = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			intList.add(s.nextInt());
		}
		for (int i = 0; i< intList.size(); i++) {
			max = Math.max(max , intList(i));
		}
	}
}
