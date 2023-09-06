public class IntroToClasses {
    public static void main(String[] args) {
        demoClassArrays();
    }

    public static void demoClassArrays() {
        Circle[] myCircles = new Circle[10];

        for (int i = 0; i < myCircles.length; i++) {
            myCircles[i] = new Circle(i);
        }

        for (Circle c : myCircles) {
            printCircle(c);
        }
    }

    public static void demoCircles() {
        System.out.printf("Number Created: %d\n",
                Circle.getNumberCreated());

        Circle c1 = new Circle();
        System.out.printf("Number Created: %d\n",
                c1.getNumberCreated());

        Circle c2 = new Circle(6);
        System.out.printf("Number Created: %d\n",
                c2.getNumberCreated());

        System.out.println(c1);
        System.out.println(c2);

        // This shows only the reference is copied, rather than
        // a full copy of the circle instance/object.
        //c1 = c2;
        // c2.radius = 8;

        System.out.println(c1);
        System.out.println(c2);

        printCircle(c1);
        printCircle(c2);
    }

    public static void printCircle(Circle c) {
        System.out.printf("A circle with radius %.2f has an area of %.2f and perimeter of %.2f\n",
                c.getRadius(),
                c.getArea(),
                c.getPerimeter());
    }

}
