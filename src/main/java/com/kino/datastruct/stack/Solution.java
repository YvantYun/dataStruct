package com.kino.datastruct.stack;

import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        String str = "AAABBBCCCDDDDD";
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.get(ch) != null){
                map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }

        }
        for(Map.Entry entry: map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }




    }
}
