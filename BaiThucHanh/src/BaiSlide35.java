//Viết chương trình nhập vào hai số và in ra số nhỏ nhất trong hai số.
import java.util.Scanner;

public class BaiSlide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so thu nhat: ");
        double SoThuNhat = sc.nextDouble();
        System.out.print("nhap vao so thu hai: ");
        double SoThuHai = sc.nextDouble();
        double SoNhoNhat =  Math.min(SoThuNhat, SoThuHai);
        System.out.println("So nho nhat la" + SoNhoNhat);
        sc.close();
    }
}
