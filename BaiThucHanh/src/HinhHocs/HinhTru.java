package HinhHocs;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        ten = "Hinh tru";
        chieuCao = 0;
    }
    public void nhapChieuCao() {
        super.nhapBanKinh();
        System.out.print("Nhap chieu cao : ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich() {
        theTich = r * r * PI  * chieuCao;
    }
    
}
