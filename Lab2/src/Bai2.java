import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 so: ");
        int so;
        so = sc.nextInt();
        if(so % 2 == 0){
            System.out.println(so + " la so chan ");
        } else {
            System.out.println(so + " la so le ");
        }
    }
}
