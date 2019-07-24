package com.kino.datastruct.linked;

import com.kino.datastruct.stack.Stack;

/**
 * @Author: kino
 * @Date: 2019/2/4 8:23
 */
public class LinkedListStack<E> implements Stack<E> {
    /**
     * 底层是一个链表
     */
    private LinkedList<E> list;

    /**
     * 构造函数
     */
    public LinkedListStack(){

        list = new LinkedList<>();
    }




    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }
}
