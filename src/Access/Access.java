package Access;

public class Access {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.city); // Работает в одном пакете
        // System.out.println(p.age); - ошибка
        System.out.println(p.getAge());

    }
}
