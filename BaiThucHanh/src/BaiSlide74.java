import java.util.Scanner;

public class BaiSlide74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhap gia tri cho mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        int tongSoChan = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                tongSoChan = tongSoChan + mang[i];
            }
        }
        System.out.println("Tong cua mang la:  " + tongSoChan);
        sc.close();
    }
}
