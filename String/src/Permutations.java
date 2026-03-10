import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Permutations {
    static String s;
    static Integer n;
    static ArrayList<String> ans = new ArrayList<String>();
    public static void main(String[] args) {
        s = "abc";
        n = 3;
        ans = new ArrayList<String>();
        HashSet<Character> hs = new HashSet<Character>();
        back(s,"",hs);
        System.out.println(ans);

    }
    public static void back(String s, String curr, HashSet hs){
        if (curr.length() == 3){
            ans.add(curr);
            return;
        }
        for (int i=0;i<n;i++){
            char c = s.charAt(i);
            if (hs.contains(c)){
                continue;
            }
            String ss = curr+c;
            hs.add(c);
            back(s,ss,hs);
            hs.remove(c);

        }
    }
}
