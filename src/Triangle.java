public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    @Override
    public double calculateArea() {
        double area = (base * height) / 2;
        double areaRoundNum = Math.round(area * 100.0) / 100.0;
        return areaRoundNum;
    }

    @Override
    public double calculateCircumference() {
        // Assume the triangle is right sided..
        // 1st. Find the the third side by using pythagoras theorem
        double thirdSide = Math.sqrt((base * base) + (height * height));
        double circumference = base + height + thirdSide;
        double circumRoundNum = Math.round(circumference * 100.0) / 100.0;
        return circumRoundNum;
    }
}
