package com.Anicoboard.Javatutorials.Overloading;

public class OverloadingDemo {
	
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1) " + arg1);}
    void A (String arg1){System.out.println("void A (String arg1) " + arg1);}
    
    //int A (){System.out.println("void A()");}
    public static void main(String[] args) {
        OverloadingDemo overloading = new OverloadingDemo();
        overloading.A();
        overloading.A(1);
        overloading.A("coding everybody");
    }
    
}