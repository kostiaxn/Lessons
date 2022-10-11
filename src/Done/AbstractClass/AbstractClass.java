
package Done.AbstractClass;


public class AbstractClass {

    public static void main(String[] args) {

        Point p = new Point(10, 25);
        p.draw();
        Circle c = new Circle(5, 10, 25);
        c.draw();
        //Shape s = new Shape(5, 5); - Ошибка
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, 7, 10);
        shapes[1] = new Circle(7, 8, 15);
        shapes[2] = new Point(15, 17);
        for (Shape s : shapes) {
            /* !!!ПЛОХОЙ КОД!!!
            if (s instanceof Circle) s.draw();
            else if (s instanceof Point) s.draw();
            */
            s.draw();
        }
    }
    
}
