public class StackDemo {
    public static void main(String[] args) {
//        StaticStack<String> cities = new StaticStack<>(3);
        DynamicStack<String> cities = new DynamicStack<>();
        try {
            cities.push("Logan");
            cities.push("Hyde Park");
            cities.push("Hyrum");
            cities.push("Paradise");

            while (!cities.isEmpty()) {
                System.out.println(cities.pop());
            }
        }
        catch (Exception ex) {
            System.out.printf("Exception: %s\n", ex.getMessage());
        }
    }
}
