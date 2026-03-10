import java.util.Arrays;
public class first {
    public static void main(String[] args){
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
