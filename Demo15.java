public class Demo15 {
    public static void main(String[] args) {
        int n = 5;
        String a = "1";
        for(int i=1;i<n;i++){
            StringBuilder sb = new StringBuilder();
            int count =0;
            for(int j=0;j<=a.length()-1;j++){
                count++;
                if(j+1<a.length() && a.charAt(j+1) == a.charAt(j))
                    continue;
                else {
                    sb.append(count).append(a.charAt(j));
                    count=0;
                }
            }
            a=sb.toString();
        }
        System.out.println(a);
    }
}
