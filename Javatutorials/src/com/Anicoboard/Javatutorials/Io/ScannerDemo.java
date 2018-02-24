package com.Anicoboard.Javatutorials.Io;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성해서 변수에 담는다.
        
        System.out.println("곱하기를 합니다. 두개의 수를 차례대로 입력해주세요.");

        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println( i * j );
        sc.close();
        
    }

}
