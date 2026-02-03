import java.util.HashSet;
import java.util.Set;

public class demo10 {
    public static void main(String[] args) {
        String str = "geeksogeeks";
        Set<Character> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i)))
                set.remove(str.charAt(i));
            else
                set.add(str.charAt(i));
        }
        if(set.size()<=1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
