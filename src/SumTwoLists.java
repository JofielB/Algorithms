import java.util.ArrayList;

public class SumTwoLists {

    //Second approach and the correct one
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l2 == null) return l1;
        if(l1 == null) return l2;

        ListNode returnedList = new ListNode();
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode currentReturnedList = returnedList;
        int carriage = 0;
        int sum;
        while (currentL1 != null || currentL2 != null){
            int valL1 = currentL1 == null ? 0:currentL1.val;
            int valL2 = currentL2 == null ? 0:currentL2.val;
            sum = carriage + valL1 + valL2;

            carriage = sum >= 10 ? sum/10 : 0;
            sum = sum >= 10 ? sum%10 : sum;

            currentReturnedList.next = new ListNode(sum);
            currentReturnedList = currentReturnedList.next;

            currentL1 = currentL1 == null ? null : currentL1.next;
            currentL2 = currentL2 == null ? null : currentL2.next;
        }

        if(carriage>0)currentReturnedList.next = new ListNode(carriage);

        return returnedList.next;
    }

    private static int reverseArray(ArrayList<Integer> array){
        int size = array.size();
        String sNumber = "";

        for (int i = size-1; i >=0 ; i--) {
            sNumber += array.get(i);
        }
        int num = Integer.parseInt(sNumber);
        return num;
    }


    //Second approach


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
