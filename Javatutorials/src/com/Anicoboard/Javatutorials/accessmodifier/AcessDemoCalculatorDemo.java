package com.Anicoboard.Javatutorials.accessmodifier;

class Calculator{
    private int left, right; // ���� ���� ����.
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    private int _sum(){ //���������ڷ� ������.
        return this.left + this.right;
    }
    
    public void sumDecoPlus(){
        System.out.println("++++" + _sum() + "++++");
    }
    
    public void sumDecoMinus(){
        System.out.println("----" +_sum() + "----");
    }
}
  
public class AcessDemoCalculatorDemo {
	
    public static void main(String[] args) {  
    	
        Calculator c1 = new Calculator();
        
        c1.setOprands(20, 10);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
        
    }
    
}