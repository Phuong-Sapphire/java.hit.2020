package BAI1;

public class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("customer name: "+getName());
        System.out.println("customer address: "+getAddress());
        System.out.println("customer balance: "+balance);
    }
}
