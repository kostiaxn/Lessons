
package Done.AbstractClass;

abstract public class Shape {
    
    public int x;
    public int y;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public void draw();
    
}
