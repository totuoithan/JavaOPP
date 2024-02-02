import java.util.Scanner;

public class BaiSlide90 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        System.out.print(" Cac ky tu co trong chuoi la: ");
        for(int i = 0; i < chuoi.length(); i++){
            kytu = chuoi.charAt(i);
            System.out.print(kytu);
        }
        sc.close();
    }
}
