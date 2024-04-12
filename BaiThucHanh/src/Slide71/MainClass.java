package Slide71;

public class MainClass {
    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron();
        ht.setBankinh(10);
        float Chuvi = ht.TinhChuvi();
        float Dientich = ht.TinhDienTich();
        System.out.println("Chu vi Hinh Tron: " + Chuvi + "; Va Dien Tich: " + Dientich);
    }
}
