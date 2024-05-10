package Set;

import java.util.HashSet;
import java.util.Scanner;

public class HashAdd {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // them phan tun vao hashSetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        // hien thi cac phan tu trong hashSetInteger
        System.out.println("Cac phan tu trong hashSetInteger la: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        // them 1 phan tu moi vao hashSetInteger vao ban phim
        // neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        } else{
            System.out.println("Phan tu " + number + "da ton tai");
        }
    }
}
