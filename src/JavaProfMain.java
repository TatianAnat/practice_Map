import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

        Map<String, String> map = new HashMap<>();
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

        Map<Object, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "one");
        linkedHashMap.put("2", "two");
        linkedHashMap.put("3", "two");
        linkedHashMap.put("4", "two");
        linkedHashMap.put("5", "one");
        linkedHashMap.put("6", "one");
        linkedHashMap.put("7", "one");
        linkedHashMap.put("8", "one");
        linkedHashMap.put("9", "one");
        linkedHashMap.put("10", "one");
        linkedHashMap.put("11", "one");
        System.out.println("map = " + linkedHashMap);
        System.out.println("map = " + linkedHashMap.get("1"));

        HashMap<MyKey, MyValue> colors = new HashMap<>();
        colors.put(new MyKey("black"),new MyValue(0,0,0));
        colors.put(new MyKey("white"),new MyValue(255,255,255));
        colors.put(new MyKey("red"),new MyValue(255,0,0));
        System.out.println("colors = " + colors);
        System.out.println("colors " + colors.get("white"));

    }
/**
 * создаём класс, который будет хранить строчку
 */
static class MyKey {
    String color;

    public MyKey(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyKey{" +
                "color='" + color + '\'' +
                '}';
    }
}
    /**
     * соответствие каждому цвету некоторого набора  RGB
     */
    static class MyValue {
        int red;
        int green;
        int blue;

        public MyValue(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        @Override
        public String toString() {
            return "MyValue{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }
    }
}
