public class FlattenMultilevel {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };


    public Node flatten(Node head){
        if(head == null) return null;

        Node headNew = new Node();
        Node newCurrent = headNew;

        Node pointer2 = head;

        while (pointer2.next != null){
            if(pointer2.child == null){
                newCurrent.next = pointer2;
                newCurrent = newCurrent.next;
                pointer2 = pointer2.next;
            }else{
                Node temp = pointer2.next;

                newCurrent.next = pointer2;
                newCurrent = newCurrent.next;

                newCurrent.next = pointer2.child;


                Node pointer3 = newCurrent;
                while (pointer3.next != null){
                    pointer3 = pointer3.next;
                }
                pointer3.next = temp;

                //printNodes(headNew);
                //System.out.println("");


                newCurrent = newCurrent.next;
                pointer2 = newCurrent.next;

            }
        }

        Node slowChain = headNew.next;
        Node chain = headNew.next.next;

        slowChain.prev = null;

        while (chain != null){
            chain.prev = slowChain;

            chain.child =null;
            slowChain.child = null;

            chain = chain.next;
            slowChain = slowChain.next;
        }

        return headNew.next;
    }


    private void printNodes (Node head){
        Node current = head;
        while (current != null){
            System.out.print( current.val+", ");
            current = current.next;
        }
        System.out.println("");
    }
}
