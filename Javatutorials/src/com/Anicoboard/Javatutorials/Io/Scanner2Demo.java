package com.Anicoboard.Javatutorials.Io;

import java.util.Scanner;

public class Scanner2Demo {
	
	public static void mulitefly() {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("���ϱ⸦ �մϴ�. �ΰ��� ���� ���ʴ�� �Է����ּ���.");
        
        while(sc.hasNextInt()) { //���ڰ� �Էµɶ� True
        	        	
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
