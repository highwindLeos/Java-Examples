package com.Anicoboard.Javatutorials.Array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String[] members = { "leos", "days", "mays" };
        for (int i = 0; i < members.length; i++) {
        	
            String member = members[i];
            System.out.println(member + " �� ����� �޾ҽ��ϴ�");
            
        }
        
        for (String member : members) {
        	
            System.out.println(member + " �� ����� �޾ҽ��ϴ� (foreach)");
            
        }

	}

}
