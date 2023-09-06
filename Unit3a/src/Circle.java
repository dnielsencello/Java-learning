public class Circle {
    private double radius;
    static int numberCreated = 0;

    Circle() {
        this(1);
    }

    Circle(double radius) {
        numberCreated++;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public void setDiameter(double newDiameter) {
        if (newDiameter >= 0) {
            radius = newDiameter / 2.0;
        }
    }

    public static int getNumberCreated() {
        return numberCreated;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
