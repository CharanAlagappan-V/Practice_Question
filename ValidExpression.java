import java.util.Scanner;
import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        if(isValid(exp)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }

    }

    public static boolean isValid(String exp){
        Stack<Character> stack = new Stack<>();
        char prevChar = ' ';

        for(int i=0;i<exp.length();i++){
            char curr = exp.charAt(i);

            if(curr == '(')
            {
                stack.push(curr);
            }else if(curr == ')'){
                if(stack.isEmpty())
                    return false;
                if(prevChar == '+' || prevChar == '-' || prevChar == '/' || prevChar == '*')
                    return false;
                stack.pop();
            }

            if(curr == '+' || curr == '-' || curr == '*' || curr == '/'){
                if(prevChar == ' ' || prevChar == '(' || prevChar == '+' || prevChar == '-' || prevChar == '/' || prevChar == '*')
                    return false;
            }
            prevChar = curr;
        }
        return stack.isEmpty() && !(prevChar == '+' || prevChar == '-' || prevChar == '/' || prevChar == '*');
    }
}
