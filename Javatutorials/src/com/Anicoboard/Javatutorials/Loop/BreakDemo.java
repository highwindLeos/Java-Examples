package com.Anicoboard.Javatutorials.Loop;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i = 0; i < 10; i++) {
			
			if (i == 5) { break; }  // 증가중에 5의 조건이 되면 반복문을 중단.
			
			System.out.println("Coding working days" + i);
		}
	}
}
