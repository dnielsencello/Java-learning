import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean getFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return String.format("Color: %s\nFilled %b",
                this.color,
                this.filled);
    }

    /**
     * @brief This does a comparison of two GeometricObjects
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        GeometricObject g = (GeometricObject)o;
        return this.color == g.color && this.filled == g.filled;
    }
}