public class EncapsulationRectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        EncapsulationRectangle rectangle = new EncapsulationRectangle();
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
