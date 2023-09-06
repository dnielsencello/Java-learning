/**
 * Assignment 3 for CS 1410
 * This program determines if points are contained within circles or rectangles.
 */
public class Inside {
    /**
     * This is the primary driver code to test the "inside" capabilities of the
     * various functions.
     */
    public static void main(String[] args) {
        double[] ptX = { 1, 2, 3, 4 };
        double[] ptY = { 1, 2, 3, 4 };
        double[] circleX = { 0, 5 };
        double[] circleY = { 0, 5 };
        double[] circleRadius = { 3, 3 };
        double[] rectLeft = { -2.5, -2.5 };
        double[] rectTop = { 2.5, 5.0 };
        double[] rectWidth = { 6.0, 5.0 };
        double[] rectHeight = { 5.0, 2.5 };
        System.out.println("--- Report of Points and Circles ---\n");
        for (int i = 0; i < circleX.length; i++) {
            for (int j = 0; j < 4; j++) {
                double cX = circleX[i];
                double cY = circleY[i];
                double r = circleRadius[i];
                double x = ptX[j];
                double y = ptY[j];

                reportPoint(x, y);
                if (isPointInsideCircle(x, y, cX, cY, r)){
                    System.out.print(" is inside ");
                } else {
                    System.out.print(" is outside ");
                }

                reportCircle(cX, cY, r);


            }
        }
        System.out.println("\n--- Report of Points and Rectangles ---\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                double left = rectLeft[i];
                double top = rectTop[i];
                double width = rectWidth[i];
                double height = rectHeight[i];
                double x = ptX[j];
                double y = ptY[j];

                reportPoint(x, y);
                if (isPointInsideRectangle(x, y, left, top, width, height)){
                    System.out.print(" is inside ");
                } else {
                    System.out.print(" is outside ");
                }
                reportRectangle(left, top, width, height);

            }
        }




    }

    static void reportPoint(double x, double y) {
        System.out.printf("Point(%.1f, %.1f)", x, y);
    }

    static void reportCircle(double x, double y, double r){
        System.out.printf("Circle(%.1f, %.1f) Radius : %.1f\n", x, y, r);
    }

    static void reportRectangle(double left, double top, double width, double height) {
        System.out.printf("Rectangle(%.1f, %.1f, %.1f, %.1f)\n", left, top, left + width, top - height);

    }

    static boolean isPointInsideCircle(double ptX, double ptY, double circleX, double circleY, double cirlceRadius) {
        double asqrd = (circleX - ptX)*(circleX - ptX);
        double bsqrd = (circleY - ptY)*(circleY- ptY);
        double c = Math.sqrt(asqrd + bsqrd);
        return cirlceRadius - c >= 0;

    }

    static boolean isPointInsideRectangle(double ptX, double ptY, double rLeft, double rTop, double rWidth, double rHeight) {

        return rLeft <= ptX && ptX <= rLeft + rWidth && rTop >= ptY && ptY >= rTop - rHeight;
    }

}
