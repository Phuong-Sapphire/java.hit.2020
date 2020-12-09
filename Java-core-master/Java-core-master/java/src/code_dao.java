public class code_dao {
    public static void main(String[] args) {
        String str="   ha     van      phong      ";
        //System.out.println(str.length());
        str=str.trim();

        for (int i=0; i<str.length(); i++)
            if (str.charAt(i)==' ')
                str=str.replace(str.charAt(i+1), Character.toUpperCase(str.charAt(i+1)));  // viết hoa chữ sau dấu cách. ( viết hoa mỗi từ đầu )
           // String phong="";
        str=str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));  // viết hoa từ đầu tiên
        System.out.println(str);//viết hoa mỗi từ

        while (str.contains("  ")) {   //xóa khoảng trắng giữa chuỗi
         //   str = str.replace("p", "P");
            str=str.replace("  ", " ");
        }
        System.out.println(str);

//        String []array_str =str.split(" ");
//        String result="";
//        System.out.println(array_str.length);
//        for (int i=0; i< array_str.length; i++){
//      //      result+= Character.toUpperCase(array_str[i].charAt(0))+ array_str[i].substring(1);
//         //  if (result.length()<str.length()) result+=' ';
//
//            if(i< array_str.length-1) result+=' ';
//        }
//            System.out.println(result);
//
//        System.out.println(result.length());

    }


}
