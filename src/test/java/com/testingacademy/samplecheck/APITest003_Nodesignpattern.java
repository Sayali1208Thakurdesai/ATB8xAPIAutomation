package com.testingacademy.samplecheck;

public class APITest003_Nodesignpattern {

    public void Step1(){
        System.out.println("Step1");
    }
    public void Step2(){
        System.out.println("Step2");
    }
    public void Step3(String Param1){
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITest003_Nodesignpattern np= new APITest003_Nodesignpattern();
        np.Step1();
        np.Step2();
        np.Step3("Sayali");
    }
}
