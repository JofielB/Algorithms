import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SumTwoLists {

    //First approach
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ArrayList<Integer> arrL1 = new ArrayList<>();
        ArrayList<Integer> arrL2 = new ArrayList<>();
        ListNode current = l1;
        while (current != null){
            arrL1.add(current.val);
            current = current.next;
        }

        current = l2;
        while (current!=null){
            arrL2.add(current.val);
            current = current.next;
        }
        int numL1 = reverseArray(arrL1);
        int numL2 = reverseArray(arrL2);
        int sum = numL1 + numL2;
        char[] sumArray = (""+sum).toCharArray();
        int index = sumArray.length-1;
        if(numL1>numL2){
            current = l1;
            while (current != null){
                current.val = Integer.parseInt(""+ sumArray[index]);
                current = current.next;
                index--;
            }
            return l1;
        }else{
            current = l2;
            while (current != null){
                current.val = Integer.parseInt(""+ sumArray[index]);
                current = current.next;
                index--;
            }
            return l2;
        }
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
