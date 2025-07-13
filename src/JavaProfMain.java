import java.util.*;

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
        MyKey white = new MyKey("white", "белый");
        MyKey white2 = new MyKey("white", "белый");
        System.out.println("white.hashCode() = " + white.hashCode());
        System.out.println("white2.hashCode() = " + white2.hashCode());
        colors.put(new MyKey("black","черный"), new MyValue(0, 0, 0));
        colors.put(white, new MyValue(255, 255, 255));
        colors.put(new MyKey("red", "красный"), new MyValue(255, 0, 0));
        System.out.println("colors = " + colors);
        System.out.println("colors.get(\"white\") " + colors.get(white));
        System.out.println("colors.get(new MyKey(\"red\")) " + colors.get(new MyKey("red","красный")));
        white.setColorRu("супербелый");
        System.out.println("colors get white changed = " + colors.get(white));
        System.out.println("colors contains red = " + colors.containsKey(new MyKey("red", "красный2")));

        System.out.println("colors " + colors);
        //заменились значения у белого цвета
        colors.put(white2, new MyValue(254,254,254));
        System.out.println("colors " + colors);

        /**
         * чтоб сохранить оба значения белого цвета
         * List<MyValue> - теперь будем сюда складывать свои цвета
         * по ключу MyKey мы сможем достать и белый 255, и белый 254
         */
        HashMap<MyKey, List<MyValue>> multiValueColors = new HashMap<>();
        multiValueColors.computeIfAbsent(white, k -> new ArrayList<>()).add(new MyValue(255,255,255));
        multiValueColors.computeIfAbsent(white2, k -> new ArrayList<>()).add(new MyValue(254,254,254));
        System.out.println("multiValueColors = " + multiValueColors);
    }

    /**
     * создаём класс, который будет хранить строчку
     */
    static class MyKey {
        String color;
        String colorRu;

        public MyKey(String color, String colorRu) {
            this.color = color;
            this.colorRu = colorRu;
        }

        public void setColorRu(String colorRu) {
            this.colorRu = colorRu;
        }

        @Override
        public String toString() {
            return "MyKey{" +
                    "color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof MyKey) {
                MyKey other = (MyKey) obj;
                return Objects.equals(color, other.color);
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(color);
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


