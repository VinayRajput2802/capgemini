import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int[] arr = new int[26];

        int asc;
        char c;

        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if (c==' '){
                continue;
            }
            asc = (int)c;
            asc = asc-97;
            arr[asc]++;
        }
        boolean ans=true;
        for (int i=0;i<26;i++){
            if (arr[i] == 0){
                ans =false;
            }
        }
        System.out.println(ans);
    }
}
