import java.util.Scanner;

/**
 * Employee
 */
public class Employee {
    public static void main(String[] args) {
        Nhanvien nv = new Employee(). new Nhanvien();
        nv.NhapThongtin();
        nv.XuatThongtin();
        nv.LuongTK();

    }
    public class Nhanvien{
        public String Ten;
        public int Tuoi;
        public int Luong;
        public int Thuong;
        public int LuongTK;

        public void NhapThongtin(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ten Nhan vien: ");
            Ten = sc.nextLine();
            System.out.print(" Tuoi Nhan vien: ");
            Tuoi = sc.nextInt();
            System.out.print(" Thuong: ");
            Thuong = sc.nextInt();
            System.out.println("Luong: ");
            Luong = sc.nextInt();
            sc.close();
        }
        public void XuatThongtin(){
            System.out.println("Ten Nhan vien: " + Ten);
            System.out.println("Tuoi Nhan vien: " + Tuoi);
            System.out.println("Thuong: " + Thuong);
            System.out.println(" Luong: " + Luong);
        }
        public void LuongTK(){
            LuongTK = Luong + Thuong;
            System.out.println(" Luong Nhan vien: " + LuongTK);
        }
    }
}