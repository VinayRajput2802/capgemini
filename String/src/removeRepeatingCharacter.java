import java.util.HashSet;

public class removeRepeatingCharacter {
    public static void main(String[] args) {
        String s = "MAMACVC";
        HashSet<Character> check = new HashSet<Character>();
        int n = s.length();
        String ss="";
        for (int i=0;i<n;i++){
            char c = s.charAt(i);
            if (check.contains(c)){
                continue;
            }
            else{
                check.add(c);
                ss = ss+c;
            }
        }
        System.out.println(ss);

    }
}
