import java.util.ArrayList;

public class IntersectionOfTwoLinked {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null||headB == null){return  null;}
        ArrayList<ListNode> listOfNodesA = new ArrayList<>();
        ListNode currentA = headA;
        while(currentA != null){
            listOfNodesA.add(currentA);
            currentA = currentA.next;
        }
        ListNode currentB = headB;
        while (currentB != null){
            for (int i = 0; i <listOfNodesA.size() ; i++) {
                if(currentB == listOfNodesA.get(i)) return currentB;
            }
            currentB = currentB.next;
        }
        return  null;
    }

    public static void main(String[] args) {

    }

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null; }
    }
}
