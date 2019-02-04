package com.kino.stack;

import com.kino.array.ArrayE;

/**
 * @Author: kino
 * @Date: 2019/1/26 23:51
 */
public class ArrayStack<E> implements Stack<E>{
    /**
     * 这里底层是一个数组
     */
    private ArrayE<E> array;

    /**
     * 这里的栈的容量就是数组的容量
     * @param capacity 容量
     */
    public ArrayStack(int capacity){
        array = new ArrayE<E>(capacity);
    }

    public ArrayStack(){
        array = new ArrayE<E>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 压栈也就是在数组尾部添加元素
     * @param e 要压入的元素
     */
    @Override
    public void push(E e) {
        array.addLast(e);
    }


    /**
     * 弹栈，由于是后进先出的数据结构，因此我们将末尾的元素移除出去，
     * 因为最先进来的肯定是末尾的元素
     * @return 出栈的元素
     */

    @Override
    public E pop() {
        //因为压入的元素在array的末尾，而stack必须是后进先出，因此应该移除最后一个
        return array.removeLast();
    }

    /**
     * 查看栈顶元素
     * @return 我们只要看数组的末尾元素即可
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack : ");
        res.append('[');
        for(int i = 0 ; i < array.getSize(); i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1){
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
