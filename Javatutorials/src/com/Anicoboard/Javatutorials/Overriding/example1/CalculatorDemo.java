package com.Anicoboard.Javatutorials.Overriding.example1;
 
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
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() { // 상위 클래스에 sum() 이 정의 되어있지만 하위 클래스에서 재정의 해서 덮어쓰게 되었다. (오버라이드)
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(20, 10);	
        c1.sum(); // 해당 메소드는 오버라이딩된 함수로 호출되게 된다.
        c1.avg();
        c1.substract();
    }
}