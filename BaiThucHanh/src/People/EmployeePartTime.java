package People;

public class EmployeePartTime extends Employee {
    public int hour;
    public EmployeePartTime(){
        position = "Part time";
        hour = 0;
    }
    public void EnterData(){
        super.EnterData();
        System.out.print("So gio lam viec: ");
        hour = sc.nextInt();
    }
    public void salary(){
        Luong = Luong * hour;
    }
    public void Display(){
        super.Display();
    }
}
