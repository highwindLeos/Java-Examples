package com.Anicoboard.Javatutorials.Overloading;

class CalculatorOverloading{
	
    int[] oprands;
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){ //foreach �� (�迭���� ���� �ε��� ��ŭ �ݺ�)
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total / this.oprands.length); // �迭�� �� / �迭�� ���� ���� (���)
    }
}

public class CalculatorDemoWhitOverloading {

    public static void main(String[] args) {
    	
    	CalculatorOverloading c1 = new CalculatorOverloading();
    	
        c1.setOprands(new int[]{10, 20, 50}); //�迭�� �����ϴ� ����ŭ ����� ����.
        c1.sum();       
        c1.avg();
        
        c1.setOprands(new int[]{10, 20, 30});
        c1.sum();       
        c1.avg();
        
    }

}
