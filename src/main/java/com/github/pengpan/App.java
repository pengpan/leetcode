package com.github.pengpan;

import com.github.pengpan.note.Solution;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Solution solution = new Solution();
        // do something
        String result = solution.reverseWords("the sky is blue");
        System.out.println(result);
    }
}
