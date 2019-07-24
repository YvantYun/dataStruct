package com.kino.datastruct.linked;

/**
 * @Author: kino
 * @Date: 2019/1/27 13:45
 */
public class LinkedList<E> {

    /**
     * 内部类node，只有这个类可以访问到,用户不需要知道链表内部结构，
     * 也可以做成外部类
     */
    private class Node{
        private E e;
        /**
         * 指针 指向下一个节点
         */
        private Node next;

        private Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
           return e.toString();
        }
    }

    /**
     * 头结点
     */
    private Node dummyHead;

    private int size;

    public LinkedList(){
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 在两边头添加新的元素
     * @param e
     */
    public void addFirst(E e){
        add(0, e);
    }

    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("error index");
        }
        Node prev = dummyHead ;
        //从第一个到要找的链表前面一个
        for(int i = 0; i <index; i++){
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size ++;
    }

    public void addLast(E e){
        add(size,e);
    }

    //获得链表的第index处的位置的元素

    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        Node cur = dummyHead.next;
        for(int i = 0 ; i < index; i++){
            cur = cur.next;
        }
        return  cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index, E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        Node cur = dummyHead.next;
        for(int i = 0 ; i < index; i++){
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur!= null){
            if(cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        Node prev = dummyHead;
        for(int i = 0 ; i < index; i ++){
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;
        return retNode.e;
    }


    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }

}
