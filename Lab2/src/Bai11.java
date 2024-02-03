import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        int [] mang = new int [n];
        
        for(int i = 0 ; i < mang.length; i++){
        System.out.print("nhap phan tu thu " +(i+1) + ": " );
        mang [i] = sc.nextInt();
        } 
    System.out.print("Mang truoc khi sap xep la ");
    for(int i = 0; i< mang.length; i++){
        System.out.print(mang[i] + " ");
    }   
    for(int i = 0;i<mang.length;i++) {
        for(int j = i + 1 ; j < mang.length;j++) {
            if(mang[i] > mang[j]) {
                int temp = mang[i];
                mang[i] = mang[j];
                mang[j] = temp;
            }
        }
    }
        System.out.println();
        System.out.print("Mang sau khi sap xep tang dan la : ");
        for(int i = 0;i < mang.length;i++) {
        System.out.print(mang[i] + " ");
        } sc.close();
    }
}
