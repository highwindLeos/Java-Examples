package com.Anicoboard.Javatutorials.scope;

public class ScopeDemo {
	static int i; // 전역변수.

	static void a() {
        int i = 0; // 지역변수
    }
 
    public static void main(String[] args) {
    	
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
        
    }

}
