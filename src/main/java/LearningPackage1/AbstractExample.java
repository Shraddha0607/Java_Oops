package LearningPackage1;

abstract class Person
{
    String name;
    // constructor
    Person(String name){
        this.name = name;
    }

    // then need to mention the methods
    abstract void speak();
    void walk(){
        System.out.println("Person can walk");
    }
}

class Employee extends Person
{
    int empId;

    Employee(int empId, String name){
        super(name);  // call the parent constructor
        this.empId = empId;
    }

    // now need to mention method to implement the abstract method of parent class
    @Override
    void speak(){
        System.out.println("This is overridden method.");
        System.out.println("You can speak also.");
    }
}
public class AbstractExample {
    public static void main(String[] args){
        System.out.println("Instance of Abstract class");

        // Person p = new Person("Bhanu");  // Error: 'Person' is abstract; cannot be instantiated

        Person p = new Employee(34, "Bhanu");
        p.speak();
        p.walk();

    }
}
