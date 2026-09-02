public class Window {
    private static final double GLASS_COST_PER_SQ_FOOT = 3.5D;
    private static final double TRIM_COST_PER_FOOT = 2.25D;

    private final double width;
    private final double height;

    public Window(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return The perimeter of the window in feet
     */
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    /**
     * @return The area of the window in feet
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Calculates the cost of the window
     * @return The total cost of the window and trim
     */
    public double getCost() {
        return getPerimeter() * TRIM_COST_PER_FOOT + getArea() * GLASS_COST_PER_SQ_FOOT;
    }
}
