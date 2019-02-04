package com.kino.linked;

import com.kino.stack.ArrayStack;
import com.kino.stack.Stack;

import java.util.Random;

/**
 * @Author: kino
 * @Date: 2019/2/4 8:30
 */
public class Main {
    public static void main1(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack();
        for(int i = 0 ; i <= 4; i ++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }


    private static double testStack(Stack<Integer> stack,int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0 ; i < opCount ; i ++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0 ; i < opCount ; i ++) {
            stack.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack,opCount);
        System.out.println(time1);


        LinkedListStack<Integer> listStack = new LinkedListStack<>();
        double time2 = testStack(listStack, opCount);
        System.out.println(time2);
    }
}
