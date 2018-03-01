package com.Anicoboard.Javatutorials.Inheritance;
 
class DivisionableCalculator extends MultiplicationableCalculator { 
	//MultiplicationableCalculator class 를 상속하고 있는 클래스. 
	//(Calculator의 메소드의 기능도 상속하고 있기때문에 해당 메소드도 사용가능하다.)
	
    public void Division() { //나눗셈을 하는 함수를 정의
        System.out.println(this.left / this.right);
    }
    
}
  
public class CalcuatorDemo3 {

    public static void main(String[] args) {
    	 
    	DivisionableCalculator c1 = new DivisionableCalculator(); // Class 를 이용한 객체 생성.
        c1.setOprands(20, 10); //함수에 매개변수 입력값이 있음.
        c1.sum();
        c1.avg();
        c1.Multiplication();
        c1.Division();
    }

}
