package com.Anicoboard.Javatutorials.Inheritance;
 
class MultiplicationableCalculator extends Calculator { //Calculator class 를 상속하고 있는 클래스. (Calculator의 메소드의 기능을 가지고온다)
	
    public void Multiplication() { //곱셈을 하는 함수를 정의
        System.out.println(this.left * this.right);
    }
    
}
  
public class CalcuatorDemo2 {

    public static void main(String[] args) {
    	 
    	MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20); //함수에 매개변수 입력값이 있음.
        c1.sum();
        c1.avg();
        c1.Multiplication();
    }

}
