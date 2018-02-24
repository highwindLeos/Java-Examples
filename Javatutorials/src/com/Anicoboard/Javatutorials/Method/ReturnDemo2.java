package com.Anicoboard.Javatutorials.Method;

public class ReturnDemo2 {

    public static String num(int i) {
    	
        if(i==0){ //조건문으로 return 을 제어할수 있다.
        	
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
