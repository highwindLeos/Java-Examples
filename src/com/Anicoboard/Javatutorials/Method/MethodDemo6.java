package com.Anicoboard.Javatutorials.Method;

public class MethodDemo6 {

	    public static String numbering(int init, int limit) {
	    	
	        int i = init;
	        String output = "";  // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
	        
	        while (i < limit) {
	            output += i;  // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
	            i++;
	        }
	        
	        return output;	// �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� 
	        						// �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ�ϸ� �ȴ�.
	    }
	 
	    public static void main(String[] args) {
	        // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
	        String result = numbering(1, 5);
	        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
	        System.out.println(result);
	    }

}
