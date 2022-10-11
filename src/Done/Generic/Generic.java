
package Done.Generic;


public class Generic {

    public static void main(String[] args) {

        Test<Integer, String> t = new Test<Integer, String>(10, "Hello");
        t.print();
        t.setData1(15);
        t.setData2("World!");
        System.out.println(t.getData1());
        System.out.println(t.getData2());
        
        Test t1 = new Test(true, false);
        t1.print();
        t1.setData1(5);
        t1.print();
    }
    
}
