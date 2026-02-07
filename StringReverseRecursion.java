public class StringReverseRecursion {
    public static void main(String[] args) {
        String a = "one two three";
        String b = "one piece";

        System.out.println(reverse(a));
        System.out.println(reverse(b));
    }

    public static String reverse(String a){
        if(a==null || a.isEmpty()){
            return a;
        }

        int spaceIndex = a.indexOf(' ');

        if(spaceIndex == -1)
            return a;

        String firstWord = a.substring(0,spaceIndex);
        String restOfTheString = a.substring(spaceIndex+1);

        return reverse(restOfTheString)+" "+firstWord;
    }
}
