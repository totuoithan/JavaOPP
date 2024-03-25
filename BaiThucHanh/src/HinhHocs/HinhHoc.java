package HinhHocs;

import java.util.Scanner;

public class HinhHoc {
    Scanner sc = new Scanner(System.in);
    public final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    
    public HinhHoc() {
        ten = "";
        chuVi = 0;
        dienTich = 0;
        theTich = 0;
    }
    public void xuatTen() {
        System.out.println("Hinh nay la: " + ten);
    }
    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }
    public void inDienTich() {
        System.out.println("Dien tich = " + dienTich);
    }
    public void inTheTich() {
        System.out.println("The tich = " + theTich);
    }

}
