import java.util.ArrayList;
import java.util.HashMap;

public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");
        strings.add("10");
        strings.add("11");
        System.out.println("strings = " + strings);

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "two");
        map.put("4", "two");
        map.put("5", "one");
        map.put("6", "one");
        map.put("7", "one");
        map.put("8", "one");
        map.put("9", "one");
        map.put("10", "one");
        map.put("11", "one");
        System.out.println("map = " + map);
    }
}