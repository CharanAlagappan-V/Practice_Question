public class LexicographicallyStringSort {
    public static void main(String[] args) {
        String[] arr = {"grapes","goa","apple","banana","sapota","watermelon","deagonfruit"};

        sortlexicographically(arr);

        for(String str : arr){
            System.out.print(str+" ");
        }
    }

    public static void sortlexicographically(String[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(compareStrings(arr[i],arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int compareStrings(String a,String b){
        int minLength = Math.min(a.length(),b.length());

        for(int i=0;i<minLength;i++){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if(ch1!=ch2)
                return ch1 - ch2;
        }

        return a.length()-b.length();
    }
}
