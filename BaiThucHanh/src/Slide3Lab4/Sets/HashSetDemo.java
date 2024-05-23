package Slide3Lab4.Sets;


import java.util.HashSet;
import java.util.Scanner;

import Slide3Lab4.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> hashSetstd = new HashSet<>();
        Student std = new Student();
        while (true) {
            // Hien thi cho nguoi dung lua chon
            System.out.println();
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Xoa thong tin sinh vien");
            System.out.println("4. Hien thi thong tin sinh vien");
            System.out.println("5. thoat");
            System.out.println("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    // nhap thong tin sinh vien
                    std.ThemThongTin(hashSetstd);
                    break;
                case 2:
                    //Sua thong tin Sinh vien
                    std.SuaThongTin(hashSetstd);
                case 3:
                    //xoa sinh vien
                    std.XoaThongTin(hashSetstd);
                    break;
                case 4:
                    //Hien thi thong tin sinh vien.
                    for(Student student: hashSetstd)
                    student.HienThiThongTin();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua cho khong Dung. vui long chon lai!");
                    break;
            }
            
        }
    }
}
