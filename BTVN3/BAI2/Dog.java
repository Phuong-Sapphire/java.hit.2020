package BAI2;

public class Dog {
    private String name;
    private int MP=100;
    public void InputName(String name){
        this.name = name;
    }
    public void ShowMP(){
        System.out.println("MP = "+MP);
    }
    public void Bark(){
        if(name.length() == 0){
            System.out.println("sorry, you don't fill name");
        }
        else System.out.println(name +"bark");
             MP-=20;
    }
}

