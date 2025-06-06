package com.thetestingacademy.ex_02_RA_Concepts;

public class APITesting_Lab04_BP {

    public APITesting_Lab04_BP step1(){
        System.out.println("Step 1");
        return this;
    }


    public APITesting_Lab04_BP step2(){
        System.out.println("Step 2");
        return this;
    }


    public APITesting_Lab04_BP step3(){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_BP bp = new APITesting_Lab04_BP();
        bp.step1().step2().step3();
    }
}
