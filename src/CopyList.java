public class CopyList {

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node headCopiedList = new Node(0);
        Node currentCopied = headCopiedList;
        Node currentOriginal = head;
        //First we create the new list with out the random nodes
        while (currentOriginal != null){
            currentCopied.next = new Node(currentOriginal.val);
            currentCopied = currentCopied.next;
            currentOriginal = currentOriginal.next;
        }

        //Now we assign the correct nodes to the random ones
        currentCopied = headCopiedList.next;
        currentOriginal = head;

        while(currentCopied != null){
            if(currentOriginal.random == null){
                currentCopied = currentCopied.next;
                currentOriginal = currentOriginal.next;

            }else {
                int index = 0;
                Node indexOriginal = head;
                //First we found the index of the random node
                while (indexOriginal != currentOriginal.random){
                    indexOriginal = indexOriginal.next;
                    index++;
                }
                //Then we connect the correct node random to the new list
                Node indexNewHead = headCopiedList.next;
                for (int i = 0; i <index ; i++) {
                    indexNewHead = indexNewHead.next;
                }
                currentCopied.random = indexNewHead;

                currentCopied = currentCopied.next;
                currentOriginal = currentOriginal.next;
            }
        }
        return headCopiedList.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
