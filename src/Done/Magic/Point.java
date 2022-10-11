/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Magic;

/**
 *
 * @author Admin
 */
public class Point implements Cloneable {
    
    public int x;
    public int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Точка с координатами (" + x + ", " + y + ")";
    }
    
    @Override
    public Point clone() {
        return new Point(x, y);
    }
    
}
