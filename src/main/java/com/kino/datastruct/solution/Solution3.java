package com.kino.datastruct.solution;

/**
 * @Author: kino
 * @Date: 2019/2/4 17:01
 */
public class Solution3 {
    /**
     * 删除元素为val的值
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head,int val){
        if(head == null){
            return null;
        }
        //删除head.next这个链表中值为val的元素
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;


    }
}
