public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode currentHead = head;
        while (head.next != null){
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = currentHead;
            currentHead = temp;

        }
        return currentHead;
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
