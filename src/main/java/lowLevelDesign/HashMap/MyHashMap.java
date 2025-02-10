package lowLevelDesign.HashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {

    private static final int INITIAL_SIZE = 16;
    Node<K, V>[] hashTable;

    MyHashMap() {
        hashTable = new Node[INITIAL_SIZE];
        System.out.println("Default cap " + INITIAL_SIZE);
    }

    MyHashMap(int capacity) {
        hashTable = new Node[tableSizeFor(capacity)];
        System.out.println("Default cap " + tableSizeFor(capacity));
    }

    final int tableSizeFor(int cap) {
        int n = 1;
        while (n < cap) {
            n <<= 1;
        }
        return n;
    }

    public class Node<K, V> {

        private  K key;
        private V value;
        private Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void put(K k, V v) {
        int hashCode = k.hashCode() % hashTable.length;

        Node value = hashTable[hashCode];

        if (value == null) {
            hashTable[hashCode] = new Node(k, v);
        } else {
            Node previosNode = value;

            while (value != null) {
                if (value.key == k) {
                    // update case
                    value.value = value;
                    return;
                }
                previosNode = value;
                value = value.next;
            }
            previosNode.next = new Node(k, v);
        }


    }

    public V get(K key) {

        int hashCode = key.hashCode() % hashTable.length;
        Node node = hashTable[hashCode];

        // also a linkedlist
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    // TODO ADD IMPLEMENTATION FOR TREEIFY

    @Override
    public String toString() {
        return "MyHashMap{" +
                "hashTable=" + Arrays.toString(hashTable) +
                '}';
    }
}
