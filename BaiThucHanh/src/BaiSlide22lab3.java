import java.util.Scanner;
public class BaiSlide22lab3 {

    public static void main(String[] args) {
        HinhTron ht = new BaiSlide22lab3(). new HinhTron();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.Inchuvi();
        ht.Indientich();

    }
    public class HinhTron {
        public final float PI = 3.14f;
        public float r;
        public float cv;
        public float dt;

        public void NhapBanKinh(){
            System.out.print("Nhap ban kinh cua hinh tron : ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat();
            sc.close();
        }
    
        public void TinhChuVi(){
            cv = 2*PI*r;
        }
        public void TinhDienTich(){
            dt = PI*r*r;
        }
        public void Inchuvi(){
            System.out.println("Chu vi hinh tron : " +cv);
        }
        public void Indientich(){
            System.out.println("Dien tich hinh tron : " +dt);

        }

    }
}