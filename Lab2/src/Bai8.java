import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, so ;
        double tong = 0;
        System.out.print("nhap vao cac so nguyen ");
            n = sc.nextInt();
            if(n <=0){
                System.out.println(" Nhap lai 1 so nguyen duong.");
            } else{
                for(int i =1; i <=n; i++){
                    System.out.print("nhap so thu "  + i + ": ");
                    so = sc.nextInt();
                    tong = tong + so;
                }
            }
                double TBC = tong / n ;
            
            System.out.printf("Trung binh cong cua mang la %.3f", TBC );
            
        sc.close();
    }
}
