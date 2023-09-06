public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return String.format("-- Rectangle --\n%s\nDims(w,h): (%.2f, %.2f)\nArea: %.2f",
                super.toString(),
                this.width,
                this.height,
                this.getArea());
    }

    @Override
    public boolean equals(Object o) {
        Rectangle r = (Rectangle)o;
        return super.equals(o) && (this.width == r.width) && (this.height == r.height);
    }

}