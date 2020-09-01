package HashAlgorithms;
import java.util.Arrays;

public class MyHashMap {

    int[] data = new int[1000];

    /** Initialize your data structure here. */
    public MyHashMap() {
        Arrays.fill(data, -1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int location = hashFunction(key);
        data[location] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return data[hashFunction(key)];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        data[hashFunction(key)] = -1;
    }

    private int hashFunction(int key){
        return key%1000;
    }
}
