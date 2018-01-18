package com.Anicoboard.Javatutorials.Basic;

public class BooleanEqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 비교연산자는 Boolean 만 결과로 반환한다.
		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		// != not 연산자 (같지 않다)
		System.out.println("-----------------------------------------------------");

		System.out.println(1 != 2); // true
		
		System.out.println(1 != 1); // false

		System.out.println("one" != "two"); // true

		System.out.println("one" != "one"); // false
		
		// > , <  비교 연산자 (한쪽항이큰가?)
		System.out.println("-----------------------------------------------------");

		System.out.println(10 > 20); // false
		System.out.println(10 > 2); // true
		System.out.println(10 > 10); // false
		
		// >= , <=  비교 연산자 (한쪽항이 크거나 같은가?)
		System.out.println("-----------------------------------------------------");
		
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 >= 10); // true
		
		//문자열을 비교연산할때는 .equals 를 사용한다.
		System.out.println("-----------------------------------------------------");
		
		String a = "hellow world";
		String b = new String("hellow world");
		
		System.out.println(a == b); // false (문자열을 비교할때는 데이터 형까지 구분한다.)
		System.out.println(a.equals(b)); // true
	}
}
