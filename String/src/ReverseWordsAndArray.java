import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        Stack<String> st = new Stack<String>();

        boolean check = true;
        char curr;
        String prev;

        for (int i=0;i<s.length();i++){
            if (check){
                st.add("");
            }
            curr = s.charAt(i);
            if (curr==' '){
                check = true;
            }
            else{
                check = false;
                prev = st.pop();
                prev = curr+prev;
                st.add(prev);

            }
        }
        String ans="";
        while (!st.empty()){
            prev = st.pop();
            ans += prev;
            ans += " ";
        }
        System.out.println(ans);
    }
}
