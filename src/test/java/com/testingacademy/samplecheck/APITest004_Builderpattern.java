package com.testingacademy.samplecheck;

public class APITest004_Builderpattern {





    public APITest004_Builderpattern Step1(){
        System.out.println("Step 1 is started");
        System.out.println("Step 1 is done");
        return this;


    }
    public APITest004_Builderpattern Step2() {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done");
        return this;
    }

    public APITest004_Builderpattern Step3(String name) {
        System.out.println("Step 3 is started");
        System.out.println("Step 3 is done" + name);
        return this;
    }

    public static void main(String[] args) {
        APITest004_Builderpattern bp= new APITest004_Builderpattern();
        bp.Step1().Step2().Step3("Sayali");
    }


}
