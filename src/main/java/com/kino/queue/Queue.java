package com.kino.queue;

/**
 * @Author: kino
 * @Date: 2019/1/27 9:13
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
