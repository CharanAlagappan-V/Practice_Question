import java.util.ArrayList;
import java.util.List;

public class AnagramFinder {
    public static void main(String[] args) {
        String[] strArr = {"catch","got","to","eat","tea","tap","mat"};
        String word = "ate";
        List<String> result = finder(strArr,word);
        System.out.println(result);
    }

    public static List<String> finder(String[] arr,String word){
        List<String> list = new ArrayList<>();
        for(String str : arr){
            if(isAnagram(str,word))
                list.add(str);
        }
        return list;
    }

    public static boolean isAnagram(String str, String word){

        if(str.length() != word.length())
            return false;

        int[] charArr = new int[256];

        for(int i=0;i<str.length();i++){
            charArr[str.charAt(i)]++;
        }
        for(int i=0;i<word.length();i++){
            charArr[word.charAt(i)]--;
        }

        for(int n : charArr){
            if(n!=0)
                return false;
        }

        return true;
    }
}
