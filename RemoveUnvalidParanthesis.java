import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class RemoveUnvalidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeUnvalidCharacters(str));
    }
    public static String removeUnvalidCharacters(String exp){
        StringBuilder builder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> removedIndices = new HashSet<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '(')
                stack.push(i);
            else if(ch == ')'){
                if(stack.isEmpty())
                    removedIndices.add(i);
                else
                    stack.pop();
            }
        }

        while(!stack.isEmpty()){
            removedIndices.add(stack.pop());
        }

        for(int i=0;i<exp.length();i++){
            if(!removedIndices.contains(i))
                builder.append(exp.charAt(i));
        }
        return builder.toString();
    }
}
