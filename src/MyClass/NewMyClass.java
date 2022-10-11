package MyClass;

public class NewMyClass {
    public static void main(String[] args) {
        User[] u_arr = new User[2];
        u_arr[0] = new User(1, "Oxi", "123456789");
        u_arr[1] = new User(2, "Mark", "987654321");
        for (User temp_u : u_arr) {
            System.out.println(temp_u.id + " " + temp_u.login + " " + temp_u.password);
        }
    }
}
