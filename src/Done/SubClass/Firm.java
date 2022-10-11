
package Done.SubClass;


public class Firm {
    
    private String nameFirm;
    public Director director;
    
    public Firm(String nameFirm, String nameDirector, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector, age);
    }
    
    class Director {
        
        public String name;
        public int age;
        
        public Director(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Создан директор в фирме " + nameFirm);
        }
        
        public boolean isPensioner() {
            return age >= 60;
        }
        
    }
    
}
