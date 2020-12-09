package BTVN_day7.Ex1;

public abstract class Person{
    private String name, address;
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
