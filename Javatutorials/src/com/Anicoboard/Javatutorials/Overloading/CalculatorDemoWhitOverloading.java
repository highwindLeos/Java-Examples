package com.Anicoboard.Javatutorials.Overloading;

class CalculatorOverloading{
	
    int[] oprands;
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){ //foreach 문 (배열안의 값의 인덱스 만큼 반복)
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total / this.oprands.length); // 배열의 합 / 배열의 값의 갯수 (평균)
    }
}

public class CalculatorDemoWhitOverloading {

    public static void main(String[] args) {
    	
    	CalculatorOverloading c1 = new CalculatorOverloading();
    	
        c1.setOprands(new int[]{10, 20, 50}); //배열에 전달하는 값만큼 계산을 실행.
        c1.sum();       
        c1.avg();
        
        c1.setOprands(new int[]{10, 20, 30});
        c1.sum();       
        c1.avg();
        
    }

}
