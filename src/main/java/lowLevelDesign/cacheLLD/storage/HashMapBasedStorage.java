package lowLevelDesign.cacheLLD.storage;

import java.util.HashMap;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {
    int capacity;
    HashMap<Key, Value> store;

    public HashMapBasedStorage(int cap) {
        this.capacity = cap;
        store = new HashMap<>();
    }

    @Override
    public void put(Key key, Value value) {
        store.put(key, value);
    }

    @Override
    public Value get(Key key) {
        return store.get(key);
    }

    @Override
    public void remove(Key key) {
        store.remove(key);
    }

    @Override
    public boolean isFull() {
        return capacity == store.size();
    }

    @Override
    public String toString() {
        return "HashMapBasedStorage{" +
                "capacity=" + capacity +
                ", store=" + store +
                '}';
    }
}
