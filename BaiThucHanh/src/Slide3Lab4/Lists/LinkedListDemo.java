package Slide3Lab4.Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Slide3Lab4.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> linkedListstd = new LinkedList<>();
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
                    std.ThemThongTin(linkedListstd);
                    break;
                case 2:
                    //Sua thong tin Sinh vien
                    std.SuaThongTin(linkedListstd);
                case 3:
                    //xoa sinh vien
                    std.XoaThongTin(linkedListstd);
                    break;
                case 4:
                    //Hien thi thong tin sinh vien.
                    for(Student student: linkedListstd)
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
