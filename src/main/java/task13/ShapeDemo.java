package task13;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red", 6, 7,30);
        shapes[1] = new Circle("green", 8, 9,40);
        shapes[2] = new Rectangle("blue", 5, 7,67,68);
        shapes[3] = new Rectangle("brown", 8, 9,40,6);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
