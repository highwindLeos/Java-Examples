package com.Anicoboard.Javatutorials.Method;

public class ReturnDemo1 {

	    public static int one() {
	    	
	        return 1;
	        
	        return 2; // 문법 에러로 컴파일이 되지 않음 (첫 리턴에서 함수가 종료되었기 때문)
	        
	        return 3;
	        
	    }
	 
	    public static void main(String[] args) {
	        System.out.println(one());
	    }

}
