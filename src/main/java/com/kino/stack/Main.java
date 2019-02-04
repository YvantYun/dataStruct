package com.kino.stack;

/**
 * @Author: kino
 * @Date: 2019/1/27 0:14
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        for(int i = 0 ; i <= 4; i ++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);

    }
}
