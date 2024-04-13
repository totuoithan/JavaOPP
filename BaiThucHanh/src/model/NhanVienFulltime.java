package model;

import util.Configs;

public class NhanVienFulltime extends NhanVien {
    private int Ngaylamthem;
    private int loaiChucvu;
    public NhanVienFulltime(String ten){
        this.ten = ten;
    }
    public NhanVienFulltime(String ten, int Ngaylamthem){
        this.ten = ten;
        this.Ngaylamthem = Ngaylamthem;
    }
    public int getloaiChucVu(){
        return loaiChucvu;
    }
    public void setloaiChucVu(int loaiChucvu){
        this.loaiChucvu = loaiChucvu;
    }
    @Override
    public String loaiNhanVien(){
        if(loaiChucvu == util.Configs.NHAN_VIEN_SEP){
            return "Nhan Vien Sep";
        } else if (loaiChucvu == util.Configs.NHAN_VIEN_LINH){
            return "Nhan Vien Linh";
        } else{
            return " ";
        }
    }
    public void tinhLuong(){
        long luongCoBan = 0;
        if (loaiChucvu == util.Configs.NHAN_VIEN_LINH) {
            luongCoBan = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH; 
        } else if (loaiChucvu == util.Configs.NHAN_VIEN_SEP) {
            luongCoBan = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP; 
        }
        long luongThemMoiNgay = Configs.LUONG_LAM_THEM_MOI_NGAY * Ngaylamthem;

        luong = luongCoBan + luongThemMoiNgay;
        System.out.println("Luong cua " + ten + " la: " + luong);
    }
}
