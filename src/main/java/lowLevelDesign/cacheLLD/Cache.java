package lowLevelDesign.cacheLLD;

import lowLevelDesign.cacheLLD.policy.EvictionPolicy;
import lowLevelDesign.cacheLLD.storage.Storage;

public class Cache<Key, Value> {

    private final Storage<Key, Value> storage;
    private final EvictionPolicy<Key> evictionPolicy;

    Cache(Storage<Key, Value> storage, EvictionPolicy<Key> evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(Key key, Value value) {
        if (storage.get(key) != null) {
            storage.put(key, value);
            evictionPolicy.keyAccessed(key);
        } else {
            if (storage.isFull()) {
                Key evictedKey = evictionPolicy.evict();
                storage.remove(evictedKey);
                System.out.println("Key evicted ! Key is " + evictedKey);
            }
            storage.put(key, value);
            evictionPolicy.keyAccessed(key);
        }

    }

    public Value get(Key key){
        if (storage.get(key) == null) {
            System.out.println("Key " + key + " has no value !" );
            return  null;
        }
        Value val = storage.get(key);
        evictionPolicy.keyAccessed(key);
        return  val;
    }

    @Override
    public String toString() {
        return "Cache{" +
                "storage=" + storage +
                ", evictionPolicy=" + evictionPolicy +
                '}';
    }
}
