package com.Anicoboard.Javatutorials.Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 
	            File file = new File("out.txt"); // ���ϰ�ü�� ������ ��´�.
	            Scanner sc = new Scanner(file); // �Է°����� file ��ü ������ �Է��Ѵ�.
	            while(sc.hasNextInt()) {
	                System.out.println("������ ������ " + sc.nextInt() + " �Դϴ�." ); 
	            }
	            sc.close();
	            
	        } catch(FileNotFoundException e){
	        	
	            e.printStackTrace();
	            
	        }
	}

}
