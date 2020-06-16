import java.util.ArrayList;

public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode remove = null;
        ListNode current = head;
        int counter = 0;
        while (current != null){
            if(current.next == null){
                //remove
                if(remove == null){
                    return head.next;
                }else {
                    remove.next = remove.next.next;
                    return head;
                }
            }
            current = current.next;
            counter++;
            if(counter>=n){
                counter = n;
                remove = remove == null ? head:remove.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

}
