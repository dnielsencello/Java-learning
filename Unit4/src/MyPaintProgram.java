public class MyPaintProgram {
    public static void main(String[] args) {

        // Declared Type vs Actual Type
        Circle c1 = new Circle(1, "red", true);
        Circle c2 = new Circle(1, "red", true);
        Rectangle r1 = new Rectangle(1, Math.PI, "green", true);

        GeometricObject g1 = c1;
        GeometricObject g2 = r1;

        //Circle c2 = (Circle)g1;
        //Rectangle r2 = (Rectangle)g2;

        //report(c1);
        //report(r1);

        compareGeometry(c1, r1);
    }

    public static void compareGeometry(GeometricObject a, GeometricObject b) {
        if (a.equals(b)) {  // Object.equals : a == b
            System.out.println("'a' and 'b' are equal");
        }
        else {
            System.out.println("'a' and 'b' are not equal");
        }
    }

    public static void report(GeometricObject o) {
        System.out.println(o.toString());
    }

//    public static void report(Rectangle r) {
//        System.out.println("Rectangle are the best!!");
//        System.out.println(r.toString());
//    }
}
