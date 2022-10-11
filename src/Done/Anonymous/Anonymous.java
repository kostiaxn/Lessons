/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Anonymous;

/**
 *
 * @author Admin
 */
public class Anonymous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape p = new Shape(10, 20) {
            
            public void draw() {
                System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
            }
        };
        p.draw();
        
        DrawShape ds = new DrawShape() {
            
            public void draw() {
                System.out.println("Рисование фигуры");
            }
        };
        ds.draw();
    }
    
}
