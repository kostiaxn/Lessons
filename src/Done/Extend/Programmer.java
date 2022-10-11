
package Done.Extend;


public class Programmer extends Person {
    
    private int exp;
    
    public Programmer(String name, String city, int age, int exp) {
        super(name, city, age);
        this.exp = exp;
    }
    
    public Programmer() {
        super();
        this.exp = 0;
    }
    
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += "; Опыт: " + this.exp + " лет";
        return s;
    }
    
}
