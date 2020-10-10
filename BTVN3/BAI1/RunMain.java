package BAI1;

public class RunMain {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();
        a.setName("Vương Thanh");
        a.setDateOfBirth("10/3/1993");
        a.setGender("Nam");
        a.setHobby("Phùng Kiến Vũ");
        b.setName("Phùng Kiến Vũ");
        b.setDateOfBirth("27/8/1992");
        b.setGender("Nam");
        b.setHobby("Vương Thanh");
        System.out.println("======INFORMATION ABOUT PERSON 1 ========");
        System.out.println("name: "+a.getName());
        System.out.println("birth: "+a.getDateOfBirth());
        System.out.println("gender: "+a.getGender());
        System.out.println("hobby: "+a.getHobby());
        System.out.println("======INFORMATION ABOUT PERSON 2 ========");
        System.out.println("name: "+b.getName());
        System.out.println("birth: "+b.getDateOfBirth());
        System.out.println("gender: "+b.getGender());
        System.out.println("hobby: "+b.getHobby());
    }
}
