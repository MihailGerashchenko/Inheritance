package HomeTask2;

public class Circle extends Shape {
    private Point a;
    private Point b;
    private double p;
    private double s;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double getX() {
        return a.getX();
    }

    public void setX(double x) {
        a.setX(x);
    }

    public double getY() {
        return a.getY();
    }

    public void setY(double y) {
        a.setY(y);
    }

    @Override
    double getPerimetr() {
        return p = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    double getArea() {
        return s = Math.PI * Math.pow(p, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
