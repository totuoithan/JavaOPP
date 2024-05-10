package List;
import java.util.Scanner;
import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println(" Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
        for(int i =0; i< n; i++){
            System.out.println("Nhap phan tu thu " + i + " : ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for(int i =1; i< arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max)>0){
                max = arrListInteger.get(i);
            }
        }
        sc.close();
        System.out.println("Phan tu lon nhat trong arrListInteger la: " + max);
    }        
}
