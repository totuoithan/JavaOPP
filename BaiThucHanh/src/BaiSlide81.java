import java.util.Scanner;

public class BaiSlide81 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao so dong cua ma tran: ");
        n = sc.nextInt();
        System.out.println(" nhap vao so cot cua ma tran: ");
        m = sc.nextInt();
        int A[][] = new int[n][m];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(" A[" + i + "]["+ j +"]= ");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.print(" Phan tu lon nhat trong ma tran = " + max);
        sc.close();
    }
}
