import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        String[] brr = new String[n];

        for (int i=0;i<n;i++) {
            String val = sc.next();
            arr[i] = val;
        }
        sc.nextLine();
        for (int i=0;i<n;i++){
            String val = sc.next();
            brr[i] = val;
        }

        char c;
        for (int i=0;i<n;i++){
            String a = arr[i];
            String b = brr[i];
            int[] alpha = new int[26];
            String ans="No";
            for (int j=0;j<a.length();j++){
                c = a.charAt(j);
                int x = (int) c-'a';
                alpha[x]++;
            }
            for (int j=0;j<b.length();j++){
                c = b.charAt(j);
                int x = (int) c-'a';
                if (alpha[x] > 0){
                    ans = "Yes";
                    break;
                }
            }
            System.out.println(ans);
        }


    }
}
