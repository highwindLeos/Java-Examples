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

       Calculator c1 = new Calculator(); //Class �� ��ü�� ����. (c1 �ν��Ͻ�)
       System.out.println(c1.PI); // ��ü�� ���� Class �� ���ǵ� ������ �����Ͽ���.

       Calculator c2 = new Calculator();
       System.out.println(c2.PI);

       System.out.println(Calculator.PI); //class �����ε� ��������� �����Ҽ� �ִ�.

   }

}