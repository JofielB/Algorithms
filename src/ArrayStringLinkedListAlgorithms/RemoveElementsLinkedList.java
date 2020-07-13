public class RemoveElementsLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next == null && head.val == val) return null;
        ListNode newHead = head;
        while(newHead != null && newHead.val == val){
            ListNode temp = newHead;
            newHead = newHead.next;
            temp.next = null;
        }

        ListNode current = newHead;
        while (current != null && current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return newHead;
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
