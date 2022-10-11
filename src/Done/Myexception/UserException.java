/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.Myexception;

/**
 *
 * @author Admin
 */
public class UserException extends Exception {
    
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private int code;
    
    public UserException(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
}
