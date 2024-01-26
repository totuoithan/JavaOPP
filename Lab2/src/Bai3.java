import java.util.Scanner;
import java.time.Year;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao ten cua ban: ");
        String ten = sc.nextLine();
        System.out.print(" nhap vao nam sinh cua ban: ");
        int namsinh = sc.nextInt();
        int namhientai = Year.now().getValue();
        int tuoi = namhientai -namsinh;
        if( tuoi < 16){
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        } else if(tuoi >= 16 && tuoi < 18 ){
            System.out.println("Ban "+ ten + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + ten + " da gia");
        }
        sc.close();
    }
}
