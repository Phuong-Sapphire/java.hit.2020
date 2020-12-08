import java.util.ArrayList;
import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // thêm các phần tử vào list
        list.add("Buổi ");
        list.add("Sáng");
        list.add("Trưa");
        list.add("Chiều");

        // kiểm tra xem PHP có tồn tại trong list hay không?
        System.out.println(list.contains("Sáng"));

    }
}
