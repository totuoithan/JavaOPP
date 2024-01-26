//Viết chương trình nhập vào 1 số nguyên n bất kỳ (n > 0) và tính tổng các chữ số của số đó.
import java.util.Scanner;
public class BaiSlide30 {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong bat ky: ");
        n = sc.nextInt();
        while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong = tong + soDu;
        }
    System.out.println("tong cac chu so = " + tong);
    sc.close();
    }
}
