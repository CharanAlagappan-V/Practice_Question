public class NumbersToWords {

    public static final String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static final String[] teens = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static final String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public static void main(String[] args) {
        int n = 100;
        System.out.println(toWords(n));
    }

    public static String toWords(int n){
        if(n==0) return "Zero";

        String res = "";

        if(n>=100){
            res = res + ones[n/100]+" Hundred";
            n=n%100;
            if(n>0)
                res = res + " and ";
        }

        if(n>=20){
            res = res + tens[n/10]+" ";
            n=n%10;
            if(n>0)
                res = res + ones[n];
        } else if(n>=10){
            res = res + teens[n%10];
        }else if(n>0){
            res = res + ones[n];
        }
        return res;
    }
}
