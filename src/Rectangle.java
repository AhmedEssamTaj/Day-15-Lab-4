public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
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


    @Override
    public double calculateArea() {
        double area = height * width;
        double areaRoundNum = Math.round(area * 100.0) / 100.0;
        return areaRoundNum;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 2 * (height + width);
        double circumRoundNum = Math.round(circumference * 100.0) / 100.0;

        return circumRoundNum;
    }
}
