
package Extend;

public class Extend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programmer p = new Programmer("Michael", "Omsk", 25, 10);
        System.out.println(p.getTextInfo());
        
        Worker w = new Worker();
        w.setSalary(20000);
        System.out.println(w.getTextInfo());
        System.out.println((new Worker()).getTextInfo());
        
        Person prog = new Programmer("Igor", "Moscow", 35, 15);
        System.out.println(prog.getTextInfo());
        
    }
    
}
