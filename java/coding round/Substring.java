import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String str = new String("");
        Stack<String> s = new Stack<>();

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == '/') {
                s.push(str);
                str = "";
            } else {
                str += name.charAt(i);

            }
        }
        s.push(str);
        //
        StringBuilder ss = new StringBuilder("");
        while (!s.isEmpty()) {
            ss.append(s.pop()+"/");
        }
        System.out.println(ss);

    }
}
