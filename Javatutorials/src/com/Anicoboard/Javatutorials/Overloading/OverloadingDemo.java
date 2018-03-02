package com.Anicoboard.Javatutorials.Overloading;

public class OverloadingDemo {
	
    void A (){
    	System.out.println("void A()");
    }
    
    void A (int arg1){
    	System.out.println("void A (int arg1) " + arg1);
    }
    
    void A (String arg1){
    	System.out.println("void A (String arg1) " + arg1);
    }
    
    /* int A (){
    	System.out.println("void A()");
    } */
    
    public static void main(String[] args) {
    	
        OverloadingDemo overloading = new OverloadingDemo();
        // 같은 이름의 메소드이지만 매개변수의 데이터형에 따라 호출되는 메소드가 달라진다. 오버로딩.
        // 장점 : 각 메소드의 기능에 따라 새로운 이름을 정의 할 필요가 사라진다.
        overloading.A(); 
        overloading.A(1);
        overloading.A("coding everybody");
        
    }
    
}