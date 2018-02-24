package com.Anicoboard.Javatutorials.Method;

public class MethodDemo5 {
	
	public static void numbering (int init, int limit) { // 매개변수 (Parameter)
		
		int i = init;
		
		while ( i < limit ) {
			System.out.println(i);
			i++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbering(1, 100); //함수를 호출할 때 입력 인자값(Argments)을 넘겨줌. (여러개의 인자값을 전달하는게 가능.)
	}

}
