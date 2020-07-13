public class LinkedListCicle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode speed3 = null;
        if(head==null || head.next== null){
            System.out.println("no cycle");
        }else {
            ListNode speed1 = head;
            ListNode speed2 = head;
            speed3 = head;
            int counter = 0;
            do{
                if (speed2 == null || speed2.next == null) {
                    return null;
                }
                speed1 = speed1.next;
                speed2 = speed2.next.next;
                if(speed2 == speed3 || speed1 == speed3){
                    System.out.println("tail connects to node index " + counter);
                    break;
                }
                if(speed2 == speed1){
                    counter++;
                    speed3 = speed3.next;
                }

            }while (speed3 != speed2);
        }
        return speed3;
    }
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
