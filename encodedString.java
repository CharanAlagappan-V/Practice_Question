public class encodedString {
    public static void main(String[] args) {
        String str = "ab12c3";
        int k = 5;

        String res = "";

        for(int i=0;i<str.length();i++){
            String substr = "";
            while(i<str.length() && !Character.isDigit(str.charAt(i))){
                substr = substr+str.charAt(i);
                i++;
            }
            int num = 0;
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                num = num*10+Integer.parseInt(String.valueOf(str.charAt(i)));
                i++;
            }
            for(int j=1;j<=num;j++){
                res =res + substr;
            }
            System.out.println(res);
            i--;
        }

        System.out.println(res.charAt(k-1));
    }
}
