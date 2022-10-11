
package Done.Extend;


public class Person {
    
    public String name;
    protected String city;
    private int age;
    public static int count = 0;
    
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        count++;
    }
    
    public Person() {
        this("Default name", "Default City", 18);
    }
    
    public String getTextInfo() {
        return "Имя " + name + "; Город " + city + "; Возраст " + age;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName() {
        setName("Default name");
    }
    
    public void setCity() {
        setCity("Default city");
    }
    
    public void setAge() {
        setAge(18);
    }
    
    public void whoIsOlder(Person p) {
        if (this.age > p.age) System.out.println(this.name + " старше, чем " + p.name);
        else if (this.age == p.age) System.out.println(this.name + " и " + p.name + " ровесники");
        else System.out.println(this.name + " младше, чем " + p.name);
    }
    
    public static int getCount() {
        return count;
    }
    
}
