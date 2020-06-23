import com.sun.scenario.effect.impl.prism.PrEffectHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode firstPointer;
        ListNode secondPointer;
        ListNode head;
        if(l1.val <= l2.val){
            head = l1;
            firstPointer = l1;
            secondPointer = l2;
        } else {
            head = l2;
            firstPointer = l2;
            secondPointer = l1;
        }

        while(firstPointer.next != null){
            if(firstPointer.next.val >= secondPointer.val){
                ListNode temp = firstPointer.next;
                firstPointer.next = secondPointer;
                secondPointer = secondPointer.next;
                firstPointer.next.next = temp;
                firstPointer = firstPointer.next;
            }else {
                firstPointer = firstPointer.next;
            }
            if(secondPointer == null){
                return head;
            }
        }
        firstPointer.next = secondPointer;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
