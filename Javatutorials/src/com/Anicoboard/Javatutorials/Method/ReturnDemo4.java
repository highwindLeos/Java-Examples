package com.Anicoboard.Javatutorials.Method;

public class ReturnDemo4 {

    public static String[] getMembers() { //���ϰ��� �迭�� �����ؼ� �������� �����͸� ��ȯ �Ҽ� �ִ�.
    	
        String[] members = { "leos", "days", "mays" };
        return members;
        
    }
 
    public static void main(String[] args) { 
    	
        String[] members = getMembers();
        
        for (int i = 0; i < members.length; i++) { //���ϰ� �迭�� ������ ���� ��� ����ŭ �ݺ�.
        	System.out.println(members[i]);
        }

    }
    
}
