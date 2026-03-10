import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String a = sc.next();

        System.out.print("Enter String: ");
        String b = sc.next();

        int[] val1 = new int[26];

        int asc;
        char c;

        for (int i=0;i<a.length();i++){
            c = a.charAt(i);
            asc = (int)c;
            asc = asc-97;
            val1[asc]++;

        }

        for (int i=0;i<b.length();i++){
            c = b.charAt(i);
            asc = (int)c;
            asc = asc-97;
            val1[asc]--;
        }
        boolean ans=true;
        for (int i=0;i<26;i++){
            if (val1[i]!=0){
                ans = false;
            }
        }
        System.out.println(ans);

    }
}
