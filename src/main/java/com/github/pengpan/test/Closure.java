package com.github.pengpan.test;

/**
 * Java闭包
 */
public class Closure {

    @FunctionalInterface
    interface Person {
        void print(String name);
    }

    private static Person person() {
        return System.out::println;
    }

    public static void main(String[] args) {
        person().print("pengpan");
    }

}
