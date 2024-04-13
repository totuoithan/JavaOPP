package model;

import util.Configs;

public class MainClass {
    public static void main(String[] args) {
        NhanVienFulltime sep = new NhanVienFulltime("Nguyen Van A ", 4);
        sep.setloaiChucVu((int)Configs.NHAN_VIEN_SEP);
        NhanVienFulltime linh1 = new NhanVienFulltime("Tran Van B ", 7);// Nhan vien lam them ngay
        linh1.setloaiChucVu((int)Configs.NHAN_VIEN_LINH);
        NhanVienFulltime linh2 = new NhanVienFulltime("Le Thi C");// Nhan vien khong lam them ngay
        linh2.setloaiChucVu((int)Configs.NHAN_VIEN_LINH);
        NhanVienPartTime Thoivu = new NhanVienPartTime("Le Van D", 240);

        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        Thoivu.tinhLuong();

        sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        Thoivu.XuatThongTin();

    }
}
