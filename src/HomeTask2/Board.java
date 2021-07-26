package HomeTask2;

import java.util.Arrays;

public class Board {
    private Shape[] shapes = new Shape[4];

    public Board() {
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void addOnBoard(Shape shape, int index) {
        if (shapes[index] == null) {
            shapes[index] = shape;
            System.out.println("The shape " + shapes[index] + " was added on the table");
        } else {
            System.out.println("The index " + index + " is already fulfilled");
        }
    }
    public void removeShape(int index) {
        if (shapes[index] != null) {
            System.out.println("The shape " + shapes[index] + " was deleted from the table");
            shapes[index] = null;
        } else {
            System.out.println("The index " + index + " is already null");
        }
    }

    public double getTotalArea() {
        double area = 0;
        System.out.println("There are such shapes on the board : ");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i]);
                System.out.println("The total area is : ");
                area += shapes[i].getArea();
            }
        }
        return area;
    }

    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }
}
