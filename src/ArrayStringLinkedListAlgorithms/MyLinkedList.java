public class MyLinkedList {
    private int mValue;
    private int size = 0;
    MyLinkedList next;
    MyLinkedList head;
    MyLinkedList tail;
    /** Initialize your data structure here. */
    public MyLinkedList(int value) {
        mValue = value;
    }

    public MyLinkedList(){

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int returnValue = -1;
        MyLinkedList current = head;
        for (int i = 0; i <index ; i++) {
               current = current.next;
               if(current == null){
                   return returnValue;
               }
        }
        returnValue = current.mValue;
        return returnValue;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion,
     * the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){
            head = new MyLinkedList(val);
        }else {
            MyLinkedList newHead = new MyLinkedList(val);
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(tail == null) {
            MyLinkedList current = head;
            while (current.next != null) {
                current = current.next;
            }
            MyLinkedList newTail = new MyLinkedList(val);
            current.next = newTail;
            tail = newTail;

        }else{
            MyLinkedList newTail = new MyLinkedList(val);
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of
     * linked list,the node will be appended to the end of linked list. If index is greater than the length,
     * the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
        }else if(index == size){
            addAtTail(val);
        }else if( index>0  && index<size){
            MyLinkedList current = head;
            for (int i = 0; i <index-1 ; i++) {
                current = current.next;
            }
            MyLinkedList newNode = new MyLinkedList(val);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index == 0){
            head = head.next;
            size--;
        }else if(index == size-1){
            MyLinkedList current = head;
            for (int i = 0; i <index-1 ; i++) {
                current = current.next;
            }

            current.next = current.next.next;
            tail = null;
            size--;
        }else if(index < size && index>0 ){
            MyLinkedList current = head;
            for (int i = 0; i <index-1 ; i++) {
                current = current.next;
            }

            current.next = current.next.next;

            size--;
        }

    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(86);
        obj.addAtIndex(1,54);
        obj.addAtIndex(1,14);
        obj.addAtHead(83);
        obj.deleteAtIndex(4);
        obj.addAtIndex(3,18);
        obj.addAtHead(46);
        obj.addAtTail(3);
        obj.addAtHead(76);
        System.out.println(obj.get(5));

    }
}
