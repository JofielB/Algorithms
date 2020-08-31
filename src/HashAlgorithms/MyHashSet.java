package HashAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    List[] data;

    /** Initialize your data structure here. */
    public MyHashSet() {
        System.out.println("create");
        data = new List[10];
    }

    public void add(int key) {
        System.out.println("add");
        int location = hashFunction(key);
        if(!contains(key)){
            if(data[location] == null) {
                data[location] = new ArrayList();
                data[location].add(key);
            }else {
                data[location].add(key);
            }
        }
    }

    public void remove(int key) {
        System.out.println("remove");
        int location = hashFunction(key);
        List currentList = data[location];
       if(currentList != null && !currentList.isEmpty()){
           for (int i = 0; i <currentList.size() ; i++) {
               int currentInt = (int)currentList.get(i);
               if(currentInt == key) {
                   currentList.remove(i);
                   return;
               }
           }
       }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        System.out.println("contains");
        int location = hashFunction(key);
        return data[location] != null && data[location].contains(key);
    }

    private int hashFunction(int key)
    {
        return key % 10;
    }
}
