package map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");

        System.out.println("Truoc Khi loai bo: ");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("Sau khi loai bo: ");
        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> KeySet = linkedHashMap.keySet();
        for(Integer Key : KeySet ){
            System.out.println(Key + " " + linkedHashMap.get(Key));
        }
    }
}
