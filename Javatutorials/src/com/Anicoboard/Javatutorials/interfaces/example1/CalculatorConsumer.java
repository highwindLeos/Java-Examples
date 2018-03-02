package com.Anicoboard.Javatutorials.interfaces.example1;

class Calculator {
	
    int left, right;
    
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorConsumer {
	
    public static void main(String[] args){
    	
    	Calculator c = new Calculator();
        c.setOprands(10, 20);
        c.sum();  
        c.avg();
         
        
    }
}