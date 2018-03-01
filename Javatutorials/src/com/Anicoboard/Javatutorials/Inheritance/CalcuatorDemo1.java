package com.Anicoboard.Javatutorials.Inheritance;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left; // member variable 에 접근 (this)
        this.right = right; // member variable 에 접근 (this)
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
}
 
class SubstractionableCalculator extends Calculator { //Calculator class 를 상속하고 있는 클래스. (Calculator의 메소드의 기능을 가지고온다)
	
    public void substract() { //밸셈을 하는 함수를 정의
        System.out.println(this.left - this.right);
    }
    
}

  
public class CalcuatorDemo1 {

    public static void main(String[] args) {
    	 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20); //함수에 매개변수 값이 있음.
        c1.sum();
        c1.avg();
        c1.substract();
        
    }

}
