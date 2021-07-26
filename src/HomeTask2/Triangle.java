package HomeTask2;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    private double ab;
    private double bc;
    private double ac;
    private double p;
    private double s;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    double getPerimetr() {
        ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        ac = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        return p = (ab + bc + ac) / 2;
    }

    @Override
    double getArea() {
        return s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
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
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
