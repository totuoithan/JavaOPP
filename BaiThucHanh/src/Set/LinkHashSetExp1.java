package Set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkHashSetExp1 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("java");
        linkedHashSet.add("C++");
        linkedHashSet.add("java");
        linkedHashSet.add("PHP");
        
        for(String str: linkedHashSet){
            System.out.println(str);
        }
    }
}
