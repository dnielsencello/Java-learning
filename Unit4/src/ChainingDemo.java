public class ChainingDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("--");
        Employee e1 = new Employee();
        System.out.println("--");
        // Faculty f1 = new Faculty("try this");
        Faculty f2 = new Faculty();
    }
}

class Person {
    public Person() {
        System.out.println("(1) Performs Person things");
    }
}

class Employee extends Person {
    public Employee() {
        System.out.println("(2) Performs Employee things");
    }
    public Employee(String msg) {
        System.out.println("(2) Performs Employee things with a message: " + msg);
    }
}

class Faculty extends Employee {
    public Faculty() {
        super("use default");
        System.out.println("(3) Performs Faculty things");
    }
    public Faculty(String msg) {
        System.out.println("(3) Performs Faculty things with a message: " + msg);
    }
}
