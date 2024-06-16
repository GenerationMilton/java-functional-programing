package com.functional.programming.course.java.functional.exercise;

public class Main {

    public static void main(String[] args) {
        BinaryOperation add = (a,b)-> a+b;
        // Or you could use:
        //
        //  BinaryOperation add = Integer::sum;
        //
        // More on method references later!

        assert 5 == add.apply(2,3);

    }
}
