import java.util.*;

class HelloWorld {
    // Function to reverse words in a given string.
    void reverseWords(String S) {
        String ans = "";
        ArrayList<String> temp = new ArrayList<String>();
        char[] h = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (h[i] != ' ') {
                ans += h[i];
            } else {
                temp.add(ans);
                ans = "";
            }
            

        }
        temp.add(ans);
        String res="";
        for(int i=0;i<temp.size();i++){
            res=temp.get(i)+" "+res;
        }
        System.out.println("Reversed Word is : "+res+" ");
        
    }

    public static void main(String args[]) {

        String name = "I love you like no more ";
        HelloWorld obj = new HelloWorld();
        obj.reverseWords(name);
    }

}
