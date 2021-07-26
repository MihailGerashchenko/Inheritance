package HomeTask2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 9);
        Point point1 = new Point(8, 12);
        Point point2 = new Point(6, 16);
        Triangle triangle = new Triangle(point, point1, point2);

        Shape shapeTriangle;
        shapeTriangle = triangle;
        double per = shapeTriangle.getPerimetr();
        double area = shapeTriangle.getArea();
        System.out.println(area);

        Point point3 = new Point(5, 6);
        Point point4 = new Point(9, 6);
        Circle circle = new Circle(point3, point4);

        Shape shapeCircle;
        shapeCircle = circle;
        double getPerCircle = shapeCircle.getPerimetr();
        double getCircle = shapeCircle.getArea();
        System.out.println(getCircle);
        System.out.println("------------------------------------------------------------");

        Board board = new Board();
        board.addOnBoard(shapeTriangle, 0);
        board.addOnBoard(shapeCircle, 1);
        System.out.println(board.getTotalArea());
        System.out.println("------------------------------------------------------------");
        board.removeShape(0);
        System.out.println(board.getTotalArea());

        Circle circle2 = new Circle(point3, point4);
        Shape shapeCircle2;
        shapeCircle2 = circle2;
        board.addOnBoard(shapeCircle2, 3);
    }
}
