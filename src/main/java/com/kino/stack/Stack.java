package com.kino.stack;

/**
 * @Author: kino
 * @Date: 2019/1/26 23:48
 */
public interface Stack<E> {
    /**
     * 获取栈内元素
     * @return 元素
     */
    int getSize();

    /**
     * 判断栈是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 压栈
     * @param e 要压入的元素
     */
    void push(E e);

    /**
     * 弹栈
     * @return 弹出栈的元素
     */
    E pop();

    /**
     * 查看栈顶元素
     * @return
     */
    E peek();
}
