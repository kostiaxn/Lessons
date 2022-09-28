package Method;

public class Method {
    public static void main(String[] args) {
        User user = new User();
        user.setId();
        user.setLogin();
        user.setPassword();
        System.out.println(user.getTextInfo());
    }
}