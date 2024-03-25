package HinhHocs;

public class HinhVuong extends HinhChuNhat{
    
    public HinhVuong() {
        ten = "Hinh vuong";
        dai = rong;
    }
    public void nhapCanh() {
        System.out.print("Nhap chieu dai canh : ");
        dai = rong = sc.nextFloat();
    }
}
