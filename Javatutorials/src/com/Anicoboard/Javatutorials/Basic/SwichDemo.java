package com.Anicoboard.Javatutorials.Basic;

public class SwichDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("switch(1)");
		
		switch(1){
		
			case 1:
				System.out.println("one");
				
			case 2:
				System.out.println("two");
				
			case 3:
				System.out.println("three");
		
		}
		
		System.out.println("switch(2)");
		
		switch(2){
		
			case 1:
				System.out.println("one");
				
			case 2:
				System.out.println("two");
				
			case 3:
				System.out.println("three");
		
		}
		
		System.out.println("switch(3)");
		
		switch(3){
		
			case 1:
				System.out.println("one");
				
			case 2:
				System.out.println("two");
				
			case 3:
				System.out.println("three");
		
		}
		
		System.out.println("switch(4)");
		
		switch(4){
		
			case 1:
				System.out.println("one");
				break; // �����ϰ� ��������
				
			case 2:
				System.out.println("two");
				break;
	
			case 3:
				System.out.println("three");
				break;
			
			default: // ���ǿ� �´� ���� ���� �� �⺻������ ����
			System.out.println("default");

		}
		
		// Switch ���� if ������ �ٲ� �ڵ�.
		int val = 4;
		
		if(val == 1) {
			System.out.println("one");
		} else if (val == 2) {
			System.out.println("two");
		} else if(val == 3) {
			System.out.println("three");
		} else {
			System.out.println("default");
		}
 
	}

}
