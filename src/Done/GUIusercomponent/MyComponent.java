/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIusercomponent;

import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class MyComponent extends JButton {
    
    private int code;
    
    public MyComponent(String title, int code) {
        super(title);
        this.code = code;
        setFont(new Font("Arial", Font.BOLD, 40));
    }
    
    public int getCode() {
        return code;
    }
    
}
