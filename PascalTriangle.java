public class PascalTriangle {
    public static void main(String[] args) {
        printPascal(5);

        printPascal(7);
    }

    public static void printPascal(int n){


        for(int i=0;i<n;i++){

//            for(int j=0;j<n-1-i;j++){
//                System.out.print(" ");
//            }

            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }

            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val+" ");
                val = val* (i-j)/(j+1);
            }
            System.out.println();
        }

    }
}
