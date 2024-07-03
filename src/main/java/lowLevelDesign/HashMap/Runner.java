package lowLevelDesign.HashMap;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        MyHashMap<Integer ,Integer> map = new MyHashMap<>(100);
        MyHashMap<Integer ,Integer> map2 = new MyHashMap<>();

        map2.put(1,2);
        map2.put(2,4);
        map2.put(4,6);

        System.out.println(map2);

        System.out.println(map2.get(3));
        System.out.println(map2.get(2));


    }
}
