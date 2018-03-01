package com.Anicoboard.Javatutorials.Array;

public class ForeachDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers = {"one", "two", "three", "four"};
		for(String number: numbers) { //foreach 문 형식 (type 변수명 : iterate ) 배열의 인덱스 만큼 반복한다.
			
		    System.out.println(number); // 반복하면서 저장된 값이 변수에 있음.
		}
	}
}
