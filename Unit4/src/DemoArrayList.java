import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {
//        ArrayList<String> cities = new ArrayList<>();

//        cities.add("Logan");
//        cities.add("Nibley");
//        cities.add("Smithfield");
//        cities.add("Clarkston");
//        cities.add("Newton");

        String[] names = {"Logan", "Nibley", "Smithfield", "Clarkston"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(names));

        ArrayList<String[]> multi = new ArrayList<>();
        ArrayList<String>[] multi2 = null;

        for (var city : cities) {
            System.out.println(city);
        }

        System.out.println("------");
        cities.add(2, "Paradise");
        for (var city : cities) {
            System.out.println(city);
        }

        System.out.println("------");
        cities.remove("Clarkston");
        for (var city : cities) {
            System.out.println(city);
        }

    }
}