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
public class User {
    
    private String login;
    
    public void setLogin(String login) throws UserException {
        if (login.length() < 3) throw new UserException(UserException.SHORT_LOGIN);
        if (login.length() > 6) throw new UserException(UserException.LONG_LOGIN);
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }
    
}
