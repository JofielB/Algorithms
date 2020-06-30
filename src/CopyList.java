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
        while (currentCopied != null){
            if(currentOriginal.random == null) {
                currentCopied = currentCopied.next;
                currentOriginal = currentOriginal.next;
            }else{
                int randomVal = currentOriginal.random.val;
                Node currentIndex = headCopiedList.next;
                if(currentOriginal.random.next == null){

                    while (currentIndex != null){
                        if(currentIndex.val == randomVal && currentIndex.next == null){
                            currentCopied.random = currentIndex;
                            currentIndex = new Node(0);
                        }
                        currentIndex =currentIndex.next;
                    }

                }else {
                    int randomNextVal = currentOriginal.random.next.val;
                    while (currentIndex != null){
                        if(randomVal == currentIndex.val && randomNextVal == currentIndex.next.val){
                            currentCopied.random = currentIndex;
                            currentIndex = new Node(0);
                        }
                        currentIndex  = currentIndex.next;
                    }
                }
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
