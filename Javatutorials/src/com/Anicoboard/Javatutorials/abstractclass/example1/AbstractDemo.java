package com.Anicoboard.Javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b(); // 추상 메소드. 추상메소드는 로직을 가지고 있지 않고 함수명만 가지고 있다.
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
    public int b(){ return 1; } 
    // A 를 상속해야만 오류가 나지 않는다. 
    // A Class 에 존재하는 b() 또한 추상 메소드이기 때문에 반드시 오버라이드 해야만 오류가 나지 않는다.
    // 반환형이 int 이기 때문에 1을 돌려준다.
}

public class AbstractDemo {
	
    public static void main(String[] args) {
    	
        B obj = new B();
        System.out.println(obj.b());
        
    }
    
}