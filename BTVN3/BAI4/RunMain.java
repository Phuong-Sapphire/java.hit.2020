package BAI4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        arr1.InputData();
        arr2.InputData();
        if(((arr1.Sum())/(arr1.getN()) > ((arr2.Sum())/(arr2.getN()))))
        {
            System.out.println("TBC arr1 lớn hơn arr2");
        }
        else if(((arr1.Sum())/(arr1.getN())) < ((arr2.Sum())/(arr2.getN())))
        {
            System.out.println("TBC arr1 nhỏ hơn arr2");
        }
        else System.out.println("hi");
    }
}
