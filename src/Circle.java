public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        double areaRoundNum = Math.round(area * 100.0) / 100.0;
        return areaRoundNum;
    }

    @Override
    public double calculateCircumference() {

        double circumference = 2 * Math.PI * radius;
        double circumRoundNum = Math.round(circumference * 100.0) / 100.0;
        return circumRoundNum;
    }


}
