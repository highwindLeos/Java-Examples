package com.Anicoboard.Javatutorials.Method;

public class ReturnDemo4 {

    public static String[] getMembers() { //리턴값을 배열로 선언해서 여러개의 데이터를 반환 할수 있다.
    	
        String[] members = { "leos", "days", "mays" };
        return members;
        
    }
 
    public static void main(String[] args) { 
    	
        String[] members = getMembers();
        
        for (int i = 0; i < members.length; i++) { //리턴값 배열의 데이터 값의 모든 값만큼 반복.
        	System.out.println(members[i]);
        }

    }
    
}
