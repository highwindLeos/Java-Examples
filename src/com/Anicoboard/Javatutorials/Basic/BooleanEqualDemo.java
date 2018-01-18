package com.Anicoboard.Javatutorials.Basic;

public class BooleanEqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �񱳿����ڴ� Boolean �� ����� ��ȯ�Ѵ�.
		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		// != not ������ (���� �ʴ�)
		System.out.println("-----------------------------------------------------");

		System.out.println(1 != 2); // true
		
		System.out.println(1 != 1); // false

		System.out.println("one" != "two"); // true

		System.out.println("one" != "one"); // false
		
		// > , <  �� ������ (��������ū��?)
		System.out.println("-----------------------------------------------------");

		System.out.println(10 > 20); // false
		System.out.println(10 > 2); // true
		System.out.println(10 > 10); // false
		
		// >= , <=  �� ������ (�������� ũ�ų� ������?)
		System.out.println("-----------------------------------------------------");
		
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 >= 10); // true
		
		//���ڿ��� �񱳿����Ҷ��� .equals �� ����Ѵ�.
		System.out.println("-----------------------------------------------------");
		
		String a = "hellow world";
		String b = new String("hellow world");
		
		System.out.println(a == b); // false (���ڿ��� ���Ҷ��� ������ ������ �����Ѵ�.)
		System.out.println(a.equals(b)); // true
	}
}
