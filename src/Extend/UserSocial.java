package Extend;

public class UserSocial extends User {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }
    public UserSocial() {
        super();
        this.name = "Mark";
        this.age = 25;
    }
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += "; Name " + this.name + "; " + "Возраст " + this.age + " years";
        return s;
}
    }
