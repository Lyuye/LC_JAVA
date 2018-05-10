package com.lc.lyuye.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
    
        ListNode newHead = null;
        
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        
        return newHead;
    }

    public static void main (){
        ListNode head = new ListNode(0);
        System.out.println(head.next.val);
    }

}