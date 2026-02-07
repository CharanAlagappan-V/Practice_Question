public class SaddlePoint {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        findSaddlePoint(mat);
    }

    private static void findSaddlePoint(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0;i<row;i++){

            int minRowValue = mat[i][0];
            int minColIdx = 0;

            for(int k=1;k<col;k++){
                if(mat[i][k]< minRowValue){
                    minRowValue = mat[i][k];
                    minColIdx = k;
                }
            }

            boolean isSaddlePoint = true;
            for(int k=0;k<row;k++){
                if(mat[k][minColIdx] > minRowValue){
                    isSaddlePoint = false;
                    break;
                }
            }

            if(isSaddlePoint){
                System.out.println(minRowValue);
                return;
            }

        }
        System.out.println("No saddle point found");
    }
}
