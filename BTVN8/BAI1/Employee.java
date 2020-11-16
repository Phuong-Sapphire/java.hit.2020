package BAI1;

public class Employee extends Person{
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("employee name: "+ getName());
        System.out.println("employee address: "+getAddress());
        System.out.println("employee salary: "+ salary);
    }
}
