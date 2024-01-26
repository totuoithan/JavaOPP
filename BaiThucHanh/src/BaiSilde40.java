//Viết chương trình nhập vào một số ngày và hiển thị tương ứng trong tuần lễ.
import java.util.Scanner;
public class BaiSilde40 {

    public static void main(String agre[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao 1 ngay: ");
        int ngay = sc.nextInt();
        switch (ngay) {
            case 0: System.out.print(" Chu nhat");
                break;
            case 1: System.out.print(" thu hai");
                break;
            case 2: System.out.print(" thu ba");
                break;
            case 3: System.out.print(" thu tu");
                break;
            case 4: System.out.print(" thu nam");
                break;
            case 5: System.out.print(" thu sau");
                break;
            case 6: System.out.print(" thu bay");
                break;
            default: System.out.print(" So ngay trong tuan la sai");
                break;
        }
        sc.close();
    }   
}
