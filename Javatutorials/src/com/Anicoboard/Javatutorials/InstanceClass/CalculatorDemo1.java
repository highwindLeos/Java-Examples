package com.Anicoboard.Javatutorials.InstanceClass;


class Calculator {
   static double PI = 3.14;
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

public class CalculatorDemo1 {

   public static void main(String[] args) {

       Calculator c1 = new Calculator(); //Class 를 객체로 생성. (c1 인스턴스)
       System.out.println(c1.PI); // 객체를 통해 Class 에 정의된 변수에 접근하였다.

       Calculator c2 = new Calculator();
       System.out.println(c2.PI);

       System.out.println(Calculator.PI); //class 명으로도 멤버변수에 접근할수 있다.

   }

}