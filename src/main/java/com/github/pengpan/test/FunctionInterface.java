package com.github.pengpan.test;

/**
 * JAVA 8 '::' 关键字
 * https://blog.csdn.net/kegaofei/article/details/80582356
 */
public class FunctionInterface {

    static class Something {
        // constructor methods
        Something() {
        }

        Something(String something) {
            System.out.println(something);
        }

        // static methods
        static String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }

        // object methods
        String endWith(String s) {
            return String.valueOf(s.charAt(s.length() - 1));
        }
    }

    @FunctionalInterface
    interface Convert<F, T> {
        T convert(F form);
    }

    public static void main(String[] args) {
        Convert<String, String> startsWith = Something::startsWith;
        System.out.println(startsWith.convert("master"));

        Something something = new Something();
        Convert<String, String> endWith = something::endWith;
        System.out.println(endWith.convert("master"));

        Convert<String, Something> constructor = Something::new;
        System.out.println(constructor.convert("constructor"));
    }
    
}
