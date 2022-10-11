
package Extend;


public class Worker extends Person {
    
    private int salary = 0;
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += "; Зарплата: " + this.salary + " рублей";
        return s;
    }
    
}
