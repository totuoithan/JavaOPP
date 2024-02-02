import java.util.Scanner;

public class BaiSlide74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(" nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        } while(n<0);
        int A[] = new int[n];
        System.out.println(" nhao cac phan tu cho mang: ");
        for(int i = 0; i < n; i++){
            System.out.print(" nhap phan tu thu " + i +" vao mang: ");
            A[i]= sc.nextInt();
        }
        double Tong = 0;
        for(int i =0; i < n; i++){
            if(A[i] % 2 == 0){
                Tong = Tong + A[i];
            }
        }
        System.out.println("Tong cua mang la: " + Tong);
        sc.close();
    }
}
