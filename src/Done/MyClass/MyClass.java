package Done.MyClass;

public class MyClass {
    public static void main(String[] args) {
        Person p = new Person("Michael", "Moscow", 30);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("Igor", "Omsk", 35);
        p_arr[1] = new Person("Jack", "Krasnodar", 15);
        p_arr[2] = new Person("Oleg", "Vladivostok", 18);
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);

        }
        for (Person temp : p_arr) { // цикл for each для перебора массива. объявление переменной temp типа Person в которой на каждой итерации помещаем элемент массива
            temp.age = 15;
            System.out.println(temp.name + " " + temp.city + " " + temp.age);
        }


        }
    }

