package People;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public int Age;
    public String Address;

    public Person(){
        FullName = "";
        Age = 0;
        Address = "";
    }
    public void EnterData(){
        System.out.print("FullName = ");
        FullName = sc.nextLine();
        System.out.print("Age = ");
        Age = sc.nextInt();
        System.out.print("Address = ");
        Address = sc.next();
    }
    public void Display(){
        System.out.println(FullName + " - " + Age + " - " + Address);
    } 
}
