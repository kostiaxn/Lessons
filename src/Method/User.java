package Method;

public class User {
    int id;
    String login;
    String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User() {
        this(0, "guest", "");
    }

    public String getTextInfo() {
        return "ID " + id + "; login " + login + "; password " + password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId() {
        setId(0);
    }

    public void setLogin() {
        setLogin("guest");
    }

    public void setPassword() {
        setPassword("");
    }
}
