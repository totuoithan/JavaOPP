package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao hashSetString
        hashSetString.add("wilson");
        hashSetString.add("nike");
        hashSetString.add("volvo");
        hashSetString.add("kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        // hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString la: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        // Neu phan tu can xoa co ton tai hashSetString thi thong bao xoa thanh cong
        // va hien thi cac phan tu con lai nguoc lai thong bao xoa khong thanh cong
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else{
            System.out.println("Xoa khong thanh cong");
        }
    }
}
