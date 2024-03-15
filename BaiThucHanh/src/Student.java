import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Sinhvien sv = new Student(). new Sinhvien();
        sv.NhapThongtin();
        sv.XuatTHongtin();
        sv.DiemTongKet();

    }
    public class Sinhvien{
        public String Ten;
        public int Tuoi;
        public float DiemA, DiemB, DiemC;
        public float DiemTK;

        public void NhapThongtin(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ten Sinh vien: ");
            Ten = sc.nextLine();
            System.out.println("Tuoi cua Sinh vien: ");
            Tuoi = sc.nextInt();
            System.out.println(" Diem A: ");
            DiemA = sc.nextFloat();
            System.out.println(" Diem B: ");
            DiemB = sc.nextFloat();
            System.out.println(" Diem C: ");
            DiemC = sc.nextFloat();
            sc.close();
        }
        public void XuatTHongtin(){
            System.out.println("Ten Sinh Vien " + Ten);
            System.out.println("Tuoi cua Sinh vien: " + Tuoi);
            System.out.println("Diem A: " + DiemA);
            System.out.println("Diem B: " + DiemB);
            System.out.println("Diem C: " + DiemC);
        }
        public void DiemTongKet(){
            DiemTK = (DiemA + DiemB + DiemC) / 3;
            System.out.print(" Diem Tong Ket: " + DiemTK);
        }

    }
}
