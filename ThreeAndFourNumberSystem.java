public class ThreeAndFourNumberSystem {
    public static void main(String[] args) {
        int n = 10;
        findKthElement(10);
    }

    public static void findKthElement(int n){
        StringBuilder builder = new StringBuilder();

        while(n>0){
            if(n%2==0)
                builder.insert(0,4);
            else
                builder.insert(0,3);
            n=(n-1)/2;
        }

        System.out.println(builder.toString());
    }
}
