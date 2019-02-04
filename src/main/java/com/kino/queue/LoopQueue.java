package com.kino.queue;

/**
 * @Author: kino
 * @Date: 2019/1/27 9:51
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;

    /**
     * 定义队首和队尾
     */
    private int front,tail;

    private int size;

    public LoopQueue(int capacity){
        //循环队列需要浪费一个空间
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        //判断队满
        //如果front < tail ,那么 （tail+1）% data.length 只能是0，因此只有front = 0时候，才能代表队满，
        //如果front > tail ,那么 （tail+1）% data.length ==> tail + 1 = front
        if((tail + 1) % data.length == front ){
            resize(getCapacity() * 2);
        }
        //数据放到队尾
        data[tail] = e;
        //本来是tail = tail +1即可，因为到数组长度的最大值需要重头再来，所以需要% 重新开始计
        tail = (tail + 1)%data.length;
        size ++;

    }

    private void resize(int newCapacity){
        E[] newData =(E[]) new Object[newCapacity + 1];
        //本质上%data.length 反正数组越界，因为这个值肯定是小于data.length的，
        // 当其 大于等于6时候会从0重新计数，而循环队列原数组的数据也是这样的
        for(int i = 0; i < size; i ++){
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        tail = size;
        front = 0;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("queue is empty");
        }
        E ret = data[front];
        data[front] = null;
        front =( front + 1) % data.length;
        size --;
        //出队，那就要缩容
        if(size == getCapacity() / 2 && getCapacity() / 2 != 0){
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("queue is empty");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue : size = %d , capacity = %d \n", size, getCapacity()));
        res.append("front [");
        //从队首遍历到，前提不能 i 不能等于队尾
        for (int i = front; i != tail;i =  (i +1) % data.length) {
            res.append(data[i]);
            //判断不是队尾
            if ((i +1) % data.length != tail) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
