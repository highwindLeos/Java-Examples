package com.Anicoboard.Javatutorials.Io;

import java.util.Scanner;

public class Scanner2Demo {
	
	public static void mulitefly() {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("곱하기를 합니다. 두개의 수를 차례대로 입력해주세요.");
        
        while(sc.hasNextInt()) { //숫자가 입력될때 True
        	        	
            int i = sc.nextInt();
        	int j = sc.nextInt();

            System.out.println( i * j ); 
        	}
        	sc.close();
        
		}
		

	public static void main(String[] args) {
		
		mulitefly();
		
	}
}
