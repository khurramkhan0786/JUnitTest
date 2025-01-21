package com.Test.Service;

public class CalculatorService {

    public static int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }

    public static int SumanyNumbers(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum= sum+number;
        }
        return sum;
    }
}
