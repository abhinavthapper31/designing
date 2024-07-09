package lowLevelDesign.cacheLLD;

import lowLevelDesign.cacheLLD.policy.LRUPolicy;
import lowLevelDesign.cacheLLD.storage.HashMapBasedStorage;

public class App {

    public static void main(String[] args) {

        Cache<Integer, Integer> cache = new Cache<Integer, Integer>(new HashMapBasedStorage<Integer, Integer>(4), new LRUPolicy<Integer>());

        cache.put(1, 2);
        cache.put(2, 3);
        cache.put(3, 4);
        cache.put(4, 5);


        System.out.println(cache);
        cache.get(3);
        System.out.println(cache);

        cache.put(5,6);

        System.out.println(cache);

    }
}
