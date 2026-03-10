import java.util.Scanner;
import java.util.*;
public class countLowerCaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = sc.nextInt();
        int count = 0;
        String ans="";
        for (int i=0;i<len;i++){
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                ans += c;
                count++;
            }
//            int x = c;
//            if (x<124 && x>=97){
//                count++;
//                ans += c;
//            }
        }
        System.out.println(ans+" "+count);
    }
}
