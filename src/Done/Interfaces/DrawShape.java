
package Done.Interfaces;

public interface DrawShape {
    
    public void draw();
    
    default void hello() {
        System.out.println("Hello World!");
    }
    
}
