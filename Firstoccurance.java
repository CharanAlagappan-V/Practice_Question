public class Firstoccurance {
    public static void main(String[] args) {
        String str1 = "ZOHOCORPORATION";
        String str2 = "PORT";
        System.out.println(printSubstring(str1,str2));
    }

    public static String printSubstring(String a, String b){
        StringBuilder builder = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
               if(a.charAt(j) == b.charAt(i)){
//                   if(j < min)
//                       min = j;
//                   if(j>max)
//                       max = j;
                   if(j>max)
                       max = j;
                   else if(j>secondMax)
                       secondMax = j;
               }
            }
        }

//        System.out.println(min);
//        System.out.println(max);

        for(int i = secondMax;i<=max;i++){
            builder.append(a.charAt(i));
        }
        return builder.toString();
    }
}
