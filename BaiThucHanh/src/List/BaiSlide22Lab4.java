package List;

import java.util.ArrayList;

public class BaiSlide22Lab4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
