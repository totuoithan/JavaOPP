import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu: " + (i + 1) + ": ");
            int number = sc.nextInt();
            arrayList.add(number);
        }
        int max = Collections.max(arrayList);
        System.out.println("Phan tu lon nhat trong day la: " + max);
        System.out.println("Nhap gia tri muon xoa: ");
        int remove = sc.nextInt();
        arrayList.removeIf(number -> number == remove);
        System.out.println("List sau khi xoa: " +arrayList);
        Collections.sort(arrayList);
        System.out.println("List sau khi sap xep: " + arrayList);
        sc.close();
    }
}