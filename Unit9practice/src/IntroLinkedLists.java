public class IntroLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.insert("Logan");
        cities.insert("Hyrum");
        cities.insert("Newton");
        cities.insert("Nibley");
        cities.insert("Amalga");
        System.out.println("----Before----");
        cities.display();
        cities.remove("Newton");
        System.out.println("--------");
        cities.display();


//        cities.display();
//        String search = "Hyde Park";
//
//        if (cities.find(search)) {
//            System.out.printf("We found %s\n", search);
//
//        }else {
//            System.out.printf("We did not find %s\n", search);
//        }

    }
}
