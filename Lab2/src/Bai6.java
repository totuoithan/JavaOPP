import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 1 so nguyen duong: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("nhap lai 1 so nguyen duong. ");
        } else {
            long giaiThua = tinhGiaiThua(n);
            System.out.println("Giai thua cua " + n + " la: " + giaiThua);
        }
        scanner.close();
    }
    public static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    
    }
}
