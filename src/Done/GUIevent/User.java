/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Done.GUIevent;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class User {
    
    private String name;
    private String email;
    private boolean news;
    private static ArrayList<User> users = new ArrayList();
    
    public User(String name, String email, boolean news) throws UserException {
        if (name.length() == 0) throw new UserException(UserException.NO_NAME);
        if (email.length() == 0) throw new UserException(UserException.NO_EMAIL);
        this.name = name;
        this.email = email;
        this.news = news;
    }
    
    public static void add(User user) {
        users.add(user);
    }
    
    public static void printAllUsers() {
        users.forEach((t) -> System.out.println(t));
    }
    
    public String toString() {
        return "Пользователь name=" + name + "; email=" + email + "; news=" + news;
    }
    
}
