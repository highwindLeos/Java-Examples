package com.Anicoboard.Javatutorials.Method;

public class ReturnDemo2 {

    public static String num(int i) {
    	
        if(i==0){ //���ǹ����� return �� �����Ҽ� �ִ�.
        	
            return "zero";
            
        } else if(i==1){
        	
            return "one";
            
        } else if(i==2){
        	
            return "two";
        }
        return "none";
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
    }

}
