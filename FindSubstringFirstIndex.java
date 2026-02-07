public class FindSubstringFirstIndex {
    public static void main(String[] args) {
        String str = "test123start";
        String subStr = "123";
        System.out.println(findIndex(str,subStr));
    }

    public static int findIndex(String str, String subStr){

        if(subStr.length()>str.length())
            return -1;

        for(int i=0;i<str.length()-subStr.length();i++){
            int j=0;
            while(j<subStr.length()-1){
                if(str.charAt(i+j)==subStr.charAt(j))
                    j++;
                else
                    break;
            }
            if(j==subStr.length()-1)
                return i;
        }
        return -1;
    }
}
