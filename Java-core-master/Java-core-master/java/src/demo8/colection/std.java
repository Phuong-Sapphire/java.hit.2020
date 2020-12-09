package demo8.colection;

public class std { //ilement Coparable
    String name;
    int age;
    public std(String name, int age){
        this.name=name;
        this.age=age;
    }
    public std(){}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        std sv=(std) obj;
        if(this.getName().compareTo(sv.getName())==0)
            return true;
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "std{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
