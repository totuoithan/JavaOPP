//Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập
import java.util.Scanner;

public class BaiSlide47 {
    public static void main(String[] args) {
    int So, tong = 0;
    Scanner sc = new Scanner(System.in);      
    do {
     System.out.println("nhap vao so nguyen bat ky: ");
       So = sc.nextInt();
       tong = tong+ So;
   } while (tong < 100); 
     System.out.println("Tong cac so nguyen vua nhap = "+tong);
     sc.close();
    } 
}
