package com.Anicoboard.Javatutorials.Io;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in); // Scanner ��ü�� �����ؼ� ������ ��´�.
        
        System.out.println("���ϱ⸦ �մϴ�. �ΰ��� ���� ���ʴ�� �Է����ּ���.");

        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println( i * j );
        sc.close();
        
    }

}
