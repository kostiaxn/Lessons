
package Done.AbstractClass;

public class Point extends Shape {

    public Point(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
    }
    
}
