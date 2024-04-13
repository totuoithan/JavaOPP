package model;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){

    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    protected String loaiNhanVien(){
        return " ";
    }
    public void XuatThongTin(){
        System.out.println("==== Nhan Vien " + ten + "====");
        System.out.println("- loai Nhan Vien: " + loaiNhanVien());
        System.out.println("- Luong: " + luong + " VND ");
    }
}
