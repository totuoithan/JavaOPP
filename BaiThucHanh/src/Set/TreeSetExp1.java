package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExp1 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao TreeSetInteger
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        // hien thi cac phan tu trong treeSetInteger
        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        // them 1 phan tu moi vao treeSetInteger tu ban phim
        // neu phan tu do da ton tai thi thon bao da ton tai nguoc lai thi them vao
        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);
        } else{
            System.out.println("Phan tu " + number + " da ton tai");
        }
    }
}
