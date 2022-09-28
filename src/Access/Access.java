package Access;

import Method.User;

public class Access {
    public static void main(String[] args) {
        Method.User user = new User();
        user.setId();
        user.setLogin();
        user.setPassword();
        System.out.println(user.getTextInfo());
    }

}
