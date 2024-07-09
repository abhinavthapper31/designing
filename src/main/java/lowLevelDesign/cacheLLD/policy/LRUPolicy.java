package lowLevelDesign.cacheLLD.policy;

import lowLevelDesign.cacheLLD.Algo.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class LRUPolicy<Key> implements EvictionPolicy<Key> {

    Deque<Node<Key>> dll;
    HashMap<Key, Node<Key>> mapper;

    public LRUPolicy() {
        dll = new ArrayDeque<>();
        mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        Node<Key> node = mapper.get(key);
        if (node != null) {
            dll.remove(node);
        } else {
            node = new Node<Key>(key);
            mapper.put(key, node);
        }
        dll.addFirst(node);
    }

    @Override
    public Key evict() {
        Node<Key> nodeToBeEvicted = dll.removeLast();
        mapper.remove(nodeToBeEvicted.getKey());
        return nodeToBeEvicted.getKey();
    }

    @Override
    public String toString() {
        return "LRUPolicy{" +
                "dll=" + dll +
                ", mapper=" + mapper +
                '}';
    }
}
