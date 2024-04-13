package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    public NhanVienPartTime(String ten, int giolamviec){
        this.ten = ten;
        this.giolamviec = giolamviec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan Vien Thoi Vu";
    }
    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*giolamviec;
    }
}
