import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double so1, so2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        so1 = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        so2 = scanner.nextDouble();

        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;
        double thuong = so1 / so2;
        double chiadu = so1 % so2;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Chia du:  " + chiadu );

        if (so1 > so2) {
            System.out.println(so1 + " > " + so2);
        } else if (so1 < so2) {
            System.out.println(so1 + " < " + so2);
        } else {
            System.out.println("hai so bang nhau: ");
        }

        scanner.close();
    }
}