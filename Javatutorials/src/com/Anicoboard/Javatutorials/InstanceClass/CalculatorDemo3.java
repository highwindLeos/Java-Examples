package com.Anicoboard.Javatutorials.InstanceClass;
 
class Calculator3{
  
    public static void sum(int left, int right){ //합
        System.out.println(left + right);
    }
     
    public static void avg(int left, int right){ //평균
        System.out.println((left + right)/2);
    }
    
}
 
public class CalculatorDemo3 {
     
    public static void main(String[] args) {
    	
        Calculator3.sum(10, 20); // Class 명으로 함수에 접근하고 있다.
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    
    }
 
}