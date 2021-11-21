package com.taoxp.jike.homework.week1;

/**
 * @author: taoxp
 * @create: 2021-11-21 18:21
 */
class MyCircularDeque {

    private int length;

    private int size;

    private ListNode  head = null;

    private ListNode tail = null;

    public MyCircularDeque(int k) {
        length = k;
        head = new ListNode(null,null,-1);
        tail = new ListNode(null,null,-1);
        head.next = tail;
        tail.pre = head;
    }

    public boolean insertFront(int value) {
        if(length == size){
            return false;
        }
        ListNode temp = head.next;
        ListNode newNode = new ListNode(head,temp,value);
        head.next = newNode;
        temp.pre = newNode;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(length == size){
            return false;
        }
        ListNode temp = tail.pre;
        ListNode newNode = new ListNode(temp,tail,value);
        tail.pre = newNode;
        temp.next = newNode;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(size == 0){
            return false;
        }
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next.pre =head;
        temp.pre =null;
        temp.next =null;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(size == 0){
            return false;
        }
        ListNode temp = tail.pre;
        temp.pre.next = tail;
        tail.pre = temp.pre;
        temp.pre =null;
        temp.next =null;
        size--;
        return true;
    }

    public int getFront() {
        return head.next.getVal();
    }

    public int getRear() {
        return tail.pre.getVal();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }

    class ListNode{
        ListNode pre;
        ListNode next;
        int val;
        public ListNode(ListNode pre,ListNode next,int val){
            this.pre=pre;
            this.next=next;
            this.val=val;
        }

        public int getVal(){
            return val;
        }
    }
}
