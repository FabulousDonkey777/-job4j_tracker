package ru.job4j.oop;

public class Calculator {

    private static int x = 10;

    public static int sum(int y) {
        return x + y;
    }
    public static int minus(int y) {
        return x - y;
    }
    public static int multiply (int y) {
        return x * y;
    }
    public static int divide (int y) {
        return x / y;
    }
    public int sumAllOperation(int y){

     return minus(y) + sum(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int resultextra = Calculator.minus(10);
        System.out.println(resultextra);
        Calculator calculator = new Calculator();
        int resultfinal = calculator.sumAllOperation(10);
        System.out.println(resultfinal);
    }
}