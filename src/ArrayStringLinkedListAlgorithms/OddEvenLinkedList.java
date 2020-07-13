public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode currentNewHead = newHead;

        ListNode currentOldHead = head.next;
        int counter = 2;
        while (currentOldHead != null){
            if(counter%2 != 0){
                currentNewHead.next = new ListNode(currentOldHead.val);
                currentNewHead = currentNewHead.next;
            }
            currentOldHead = currentOldHead.next;
            counter++;
        }
        counter  = 1;
        currentOldHead = head;
        while (currentOldHead != null){
            if(counter%2 == 0){
                currentNewHead.next = new ListNode(currentOldHead.val);
                currentNewHead = currentNewHead.next;
            }
            currentOldHead = currentOldHead.next;
            counter++;
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
