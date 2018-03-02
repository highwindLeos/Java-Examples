package com.Anicoboard.Javatutorials.finals;
// final 키워드로 정의된 메소드와 변수는 오버라이딩(덮어씀) 과 값 변경을 할수 없다.
// 해당 키워드는 변수의 값이 변경되거나 메소드를 오버라이딩 하지 않고자 할때 지정해서 값을 보호한다.

class Calculator {
    static final double PI = 3.14; // 해당값을 변경할수 없다 (final 로 지정)
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
 
    }
 
}