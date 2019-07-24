package com.kino.datastruct.stack;

/**
 * @Author: kino
 * @Date: 2019/1/27 0:24
 */
public class Solution {
    public boolean isValid(String s){

        /**
         * 检测括号合法性
         */
        Stack<Character> stack = new ArrayStack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //根据题意，左边为左括号的都进栈
            if(c =='(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return true;
                }
                //弹栈
                char topChar = stack.pop();
                //栈顶元素和最近传来的右括号元素进行比对，如果匹配则进行下一个括号匹配
                if(c == ')' && topChar != '('){
                    return false;
                }
                if(c == ']' && topChar != '['){
                    return false;
                }
                if(c == '}' && topChar != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
