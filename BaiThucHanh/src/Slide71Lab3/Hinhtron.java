package Slide71Lab3;

public class Hinhtron {
    private final float Pi =3.14f;
    private float banKinh;
    public float getBankinh(){
        return banKinh;
    }
    public void setBankinh( float banKinh){
        this.banKinh = banKinh;
    }
    public float TinhChuvi(){
        return 2*Pi*banKinh;
    }
    public float TinhDienTich(){
        return Pi*banKinh*banKinh;
    }
}
