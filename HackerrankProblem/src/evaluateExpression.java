import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class evaluateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        HashSet<Character> hash = new HashSet<>();
//        hash.add('/');
//        hash.add('*');
//        hash.add('-');
//        hash.add('+');
//        int ans = 0;
        double num1,num2,num3;
        Stack<Double> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='+'){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num1+num2;
                stack.push(num3);
            } else if (c=='-') {
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2-num1;
                stack.push(num3);
            }
            else if(c=='*'){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num1*num2;
                stack.push(num3);
            }
            else if(c=='/'){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2/num2;
                stack.push(num3);
            }
            else{
                num1 = (double) (c-'0');
                System.out.println(num1+" "+c);
                stack.push(num1);
            }


        }
        System.out.println(stack.pop());

    }
}
