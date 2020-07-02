public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode last = head;
        ListNode beforeLats = null;
        ListNode current = head;
        //Define the size of the list
        int size = 0;
        while (current != null){
            current = current.next;
            size++;
        }
        //Get how many rotations are really needed
        int spins = k % size;
        current = head;

        for (int i = 0; i <k ; i++) {

            while (current.next != null){
                beforeLats = current;
                last = current.next;

                current = current.next;
            }

            last.next = head;
            if(beforeLats != null)  beforeLats.next = null;
            head = last;

            current = head;
            last = head;
            beforeLats = null;

        }

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
