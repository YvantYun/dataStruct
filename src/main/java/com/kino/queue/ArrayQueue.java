package com.kino.queue;

/**
 * @Author: kino
 * @Date: 2019/1/27 9:16
 */
public class ArrayQueue<E> implements Queue<E> {

    private ArrayE<E> array;

    public ArrayQueue(int capacity){
        array = new ArrayE<>(capacity);
    }

    public ArrayQueue(){
        array = new ArrayE<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 核心方法入队，也是加入数组尾部元素
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * 出队，时间复杂度是O(n)，因为最先进来的数组元素已经在最开始了
     * 所以我们要移除数组首部元素
     * @return E
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * 查看队首元素，很简单我们只需要获取数组首部的元素即可
     * @return
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue :");
        res.append("front [");
        for(int i = 0 ; i < array.getSize(); i ++){
            res.append(array.get(i));
            //最后一个元素不需要,因此判断不是最后一个元素的话就加,
            if(i != array.getSize() -1){
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for(int i = 0 ; i < 10; i ++){
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue);
            if( i % 3 ==2){
                arrayQueue.dequeue();
                System.out.println(arrayQueue);
            }
        }


    }
}
