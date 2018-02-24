package com.Anicoboard.Javatutorials.Method;

public class MethodDemo4 {
	
	public static void numbering (int limit) { // 매개변수 (Parameter)
	
		int i = 0;
		
		while ( i < limit) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbering(100); //함수를 호출할 때 입력 인자값(Argments)을 넘겨줌.

	}

}
