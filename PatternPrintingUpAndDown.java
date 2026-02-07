public class PatternPrintingUpAndDown {
    public static void main(String[] args) {
        int n = 4;
        int currentNum;

        for(int i=1;i<=n;i++){
            currentNum = (i*(i+1))/2;
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print(currentNum-- + " ");
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            currentNum = (i*(i+1))/2;
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=0 ;j<i;j++){
                System.out.print(currentNum--+" ");
            }
            System.out.println();
        }
    }
}
