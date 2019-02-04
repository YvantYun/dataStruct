package com.kino.solution;

/**
 * @Author: kino
 * @Date: 2019/2/4 10:54
 */
public class Solution {
    public ListNode removeElements(ListNode head,int val){
        while ( head != null && head.val ==val ){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if(head == null){
            return null;
        }

        ListNode prev = head;
        //遍历到链表末尾
        while (prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;

            }

            
        }
    }
}
