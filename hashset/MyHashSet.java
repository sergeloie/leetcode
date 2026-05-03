package hashset;

import java.util.BitSet;

public class MyHashSet {

    private final BitSet bitSet;

    public MyHashSet() {
        this.bitSet = new BitSet(1_000_000);
    }

    public void add(int key) {
        bitSet.set(key);
    }

    public void remove(int key) {
        bitSet.clear(key);
    }

    public boolean contains(int key) {
        return bitSet.get(key);
    }
}
