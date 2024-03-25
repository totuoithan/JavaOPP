package HinhHocs;

public class HinhTron extends HinhHoc {
    public float r;

    public HinhTron() {
        ten = "Hinh tron";
        r = 0;
    }
    public void nhapBanKinh() {
        System.out.print("Nhap ban kinh cho hinh : ");
        r = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = r * 2 * PI;
    }
    public void tinhDienTich() {
        dienTich = r * r * PI;
    }
}
