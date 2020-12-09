package demo8.colection;

import java.util.Comparator;

public class Compare implements Comparator <std> {

    @Override
    public int compare(std o1, std o2) {
        //return -(o1.getAge()-o2.getAge());
        return -o1.getName().compareTo(o2.getName());
    }

}
