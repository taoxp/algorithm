package com.taoxp.jike.homework.week1;

/**
 * @author: taoxp
 * @create: 2021-11-21 18:19
 */
public class MergeTwoLists {

    /**
     * 合并两个有序链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode proctect = new ListNode(-101,null);
        ListNode now = proctect;
        while(l1 !=null || l2 !=null){
            if((l1!=null && l2 == null) || (l1!=null && l1.val<=l2.val)){
                now.next = l1;
                l1 = l1.next;
                now=now.next;
            }else{
                now.next = l2;
                l2 = l2.next;
                now=now.next;
            }
        }
        return proctect.next;
    }


    /**
     * 定义节点
     */
    class ListNode {
        int      val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
