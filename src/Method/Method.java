package Method;

public class Method {
    public static void main(String[] args) {
        Person p = new Person("Igor", "Omsk", 20);
        System.out.println(p.getTextInfo());
        p.setName("Mark");
        p.setCity("Minsk");
        p.setAge(22);
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());


        Person pNew = new Person("Alex", "Moscow", 25);
        p.whoIsOlder(pNew);
        pNew.setAge(15);
        p.whoIsOlder(pNew);

        Person person = new Person();
        System.out.println(person.getTextInfo());

        pNew.setName();
        pNew.setCity();
        pNew.setAge();
        System.out.println(pNew.getTextInfo());

    }

}
