package demo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        //regex
//        String abc="tooi ddi  ch  o  i";
//        String [] arr=abc.split("\\s{2}");
        String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern= Pattern.compile(regex);
        String pw="1a234567";
        String pw2="abc@123ABC";
        Matcher matcher1=pattern.matcher(pw);
        Matcher matcher2=pattern.matcher(pw2);
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());


//        for (String s: arr){
//            System.out.println(s);
//        }
    }
}
