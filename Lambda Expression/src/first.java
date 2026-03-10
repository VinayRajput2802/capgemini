public class first {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        Power ans = (a,b)->Math.pow(a,b);
        System.out.println(ans.powe(x,y));
    }
}
@FunctionalInterface
interface Power{
    double powe(int a,int b);
}
