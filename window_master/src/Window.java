public class Window {
    public static double glassCostPerSqFoot = 3.5D;
    public static double trimCostPerFoot = 2.25D;

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
        return getPerimeter() * trimCostPerFoot + getArea() * glassCostPerSqFoot;
    }

    public static void setGlassCost(double cost) {
        glassCostPerSqFoot = cost;
    }
    public static void setTrimCost(double cost) {
        trimCostPerFoot = cost;
    }
}
