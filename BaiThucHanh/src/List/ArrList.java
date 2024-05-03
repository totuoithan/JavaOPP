package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println(" cac phan tu co trong arrListChar la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
    }
}
