
package Done.Interfaces;


public class Interfaces {

    public static void main(String[] args) {

        Circle c = new Circle(10, 20, 15);
        c.draw();
        Point p = new Point(5, 7);
        p.draw();
        c.hello();
        p.hello();
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
