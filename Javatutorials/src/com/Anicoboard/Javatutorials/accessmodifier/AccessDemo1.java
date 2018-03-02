package com.Anicoboard.Javatutorials.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){ // 접근제어자.
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo1 {
	
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
       // System.out.println(a.z()); // 이 코드는 오류가 발생한다. private 로 지정된 Class 이기 때문에 접근이 되지 않는다.
        System.out.println(a.x());
    }
    
}