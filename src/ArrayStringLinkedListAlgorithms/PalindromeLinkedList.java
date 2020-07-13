import java.util.ArrayList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null){
            list.add(current);
            current = current.next;
        }
        current = head;
        int size = list.size();
        for (int i = size-1; i>=size/2 ; i--) {
            if(current.val != list.get(i).val){
                return false;
            }
            current = current.next;
        }
        return true;
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
