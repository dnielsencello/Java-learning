public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("-- Circle --\n%s\nRadius: %.2f\nArea: %.2f",
                super.toString(),
                this.radius,
                this.getArea());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return super.equals(o) && this.radius == c.radius;
        }
        else if (o instanceof Rectangle) {
            Rectangle r = (Rectangle)o;
            return super.equals(o) && this.getArea() == r.getArea();
        }
        else if (o instanceof GeometricObject) {
            return super.equals(o);
        }

        return false;
    }
}
