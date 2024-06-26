package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BaiSlide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh Pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg: " + hashMapCity.get("QNg"));
        System.out.println("NT: " + hashMapCity.get("NT"));
        if (hashMapCity.containsKey("Thanh Pho Ho Chi Minh")) {
            System.out.println("Co Thanh Pho Ho Chi Minh trong hashMaoCity.");
        }
    }
}
