package com.Anicoboard.Javatutorials.Method;

public class MethodDemo5 {
	
	public static void numbering (int init, int limit) { // �Ű����� (Parameter)
		
		int i = init;
		
		while ( i < limit ) {
			System.out.println(i);
			i++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbering(1, 100); //�Լ��� ȣ���� �� �Է� ���ڰ�(Argments)�� �Ѱ���. (�������� ���ڰ��� �����ϴ°� ����.)
	}

}
