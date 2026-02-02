import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a == 'a' || a== 'e' || a== 'i' || a=='o' || a=='u'){
                if(map.containsKey(a)){
                    map.put(a, map.get(a)+1);
                }else{
                    map.put(a,1);
                }
            }
        }
        map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).ifPresent(System.out::println);
//        char res = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

//        System.out.println(res);
    }
}
