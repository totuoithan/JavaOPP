package Slide3Lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;
    Scanner sc = new Scanner(System.in);
    public Student(){

    }
    public void NhapThongTin(){
        System.out.println("Nhap ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
        System.out.println();
    }
    public void HienThiThongTin(){
        System.out.println("Danh sach Sinh vien: ");
        System.out.println("FullName: " + FullName + "- Tuoi: " + Age + "\n");
    }
    public void ThemThongTin(ArrayList<Student> arrList){
        System.out.println("Nhap so luong sinh vien:  ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            Student std = new Student();
            std.NhapThongTin();
            arrList.add(std);
        }
    }
    public void SuaThongTin(ArrayList<Student> arrList){
        System.out.println("Nhap ten sinh vien de sua: ");
        String ten = sc.next();
        for(int i = 0; i < arrList.size(); i++){
            if (arrList.get(i).FullName.equals(ten)) {
                System.out.println("Truoc khi Sua: ");
                arrList.get(i).HienThiThongTin();
                System.out.println("sua: ");
                System.out.println("Nhap Ten: ");
                String newFullName = sc.next();
                System.out.println("Nhap tuoi: ");
                Integer newAge = sc.nextInt();
                arrList.get(i).FullName = newFullName;
                arrList.get(i).Age = newAge;
                System.out.println("sau khi sua: ");
                arrList.get(i).HienThiThongTin();
            }
        }
    }
    public void XoaThongTin(ArrayList<Student> arrList){
        System.out.println("Nhap ten sinh vien de xoa: ");
        String ten = sc.nextLine();
        for(int i = 0; i < arrList.size(); i++){
            if (arrList.get(i).FullName.equals(ten)) {
                arrList.remove(i);
                System.out.println("Da xoa sinh vien co ten: " + ten);
                return;
            }
        }
    }
    public void ThemThongTin(LinkedList<Student> linkedStd){
        System.out.println("Nhap so luong sinh vien:  ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            Student std = new Student();
            std.NhapThongTin();
            linkedStd.add(std);
        }
    }
    public void SuaThongTin(LinkedList<Student> linkedStd){
        System.out.println("Nhap ten sinh vien de sua: ");
        String ten = sc.nextLine();
        for(int i = 0; i < linkedStd.size(); i++){
            if (linkedStd.get(i).FullName.equals(ten)) {
                System.out.println("Truoc khi Sua: ");
                linkedStd.get(i).HienThiThongTin();
                System.out.println("sua: ");
                System.out.println("Nhap Ten: ");
                String newFullName = sc.next();
                System.out.println("Nhap tuoi: ");
                Integer newAge = sc.nextInt();
                linkedStd.get(i).FullName = newFullName;
                linkedStd.get(i).Age = newAge;
                System.out.println("sau khi sua: ");
                linkedStd.get(i).HienThiThongTin();
            }
        }
    }
    public void XoaThongTin(LinkedList<Student> linkedStd){
        System.out.println("Nhap ten sinh vien de xoa: ");
        String ten = sc.nextLine();
        for(int i = 0; i < linkedStd.size(); i++){
            if (linkedStd.get(i).FullName.equals(ten)) {
                linkedStd.remove(i);
                System.out.println("Da xoa sinh vien co ten: " + ten);
                return;
            }
        }
    }
    public void ThemThongTin(HashSet<Student> hashSetstd){
        System.out.println("Nhap so luong sinh vien:  ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            Student std = new Student();
            std.NhapThongTin();
            hashSetstd.add(std);
        }
    }
    public void SuaThongTin(HashSet<Student> hashSetstd){
        System.out.println("Nhap ten sinh vien de sua: ");
        String ten = sc.nextLine();
        for(Student std : hashSetstd){
            if (std.FullName.equals(ten)) {
                System.out.println("Truoc khi Sua: ");
                std.HienThiThongTin();
                System.out.println("sua: ");
                System.out.println("Nhap Ten: ");
                String newFullName = sc.next();
                System.out.println("Nhap tuoi: ");
                Integer newAge = sc.nextInt();
                std.FullName = newFullName;
                std.Age = newAge;
                System.out.println("sau khi sua: ");
                std.HienThiThongTin();
            }
        }
    }
    public void XoaThongTin(HashSet<Student> hashSetstd){
        System.out.println("Nhap ten sinh vien de xoa: ");
        String ten = sc.nextLine();
        for(Student std : hashSetstd){
            if (std.FullName.equals(ten)) {
                hashSetstd.remove(std);
                System.out.println("Da xoa sinh vien co ten: " + ten);
                return;
            }
        }
    }

}
