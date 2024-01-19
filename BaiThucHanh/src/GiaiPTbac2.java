import java.util.Scanner;
public class GiaiPTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("nhap a: ");
        a = sc.nextDouble();
        System.out.println("nhap b: " );
        b= sc.nextDouble();
        System.out.println("nhap c: ");
        c= sc.nextDouble();
        delta = b*b - 4*a*c;
        if( delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(delta == 0){
            double x= x1 =x2 = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep = " +x);
        } else{
            x1 = -b + Math.sqrt(delta) / (2 * a);
            x2 = -b - Math.sqrt(delta) / (2 * a);
            System.out.println("phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = "+ x1);
            System.out.println("x2 = " +x2);
        }
    }
}
