import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen tu 1-12 ");
        int thang = sc.nextInt();

        if (thang < 1 || thang > 12) {
            System.out.println("nhap lai 1 so nguyen tu 1 - 12: ");
        } else {
            System.out.println("Thang " + thang);
        }
        sc.close();
    }
}
