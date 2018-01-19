package com.Anicoboard.Javatutorials.Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 
	            File file = new File("out.txt"); // 파일객체를 변수에 담는다.
	            Scanner sc = new Scanner(file); // 입력값으로 file 객체 변수를 입력한다.
	            while(sc.hasNextInt()) {
	                System.out.println("파일의 내용은 " + sc.nextInt() + " 입니다." ); 
	            }
	            sc.close();
	            
	        } catch(FileNotFoundException e){
	        	
	            e.printStackTrace();
	            
	        }
	}

}
