import java.util.Stack;
import java.util.Scanner;
public class reverseStringWords {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        boolean check = true;
        String ans = "";
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if (check){
                st.add("");
            }

            if (c==' '){
                check = true;
            }
            else{
                String ss = st.pop();
                ss += c;
                st.add(ss);
                check=false;
            }
        }
        String curr;
        while (!st.empty()){
            curr = st.pop();
            ans += curr;
            ans += " ";

        }
        System.out.println(ans);
    }
}
