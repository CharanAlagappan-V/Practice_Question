public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = 1;

        for(int i=0;i<n;i++){
            rotateMatrix(mat);
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] mat){
        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;

        int prev,curr;

        while(row<m && col < n){
            if(row >= m-1 && col >= n-1) break;

            prev = mat[row+1][col];

            for(int i=col;i<=n-1;i++){
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;

            for(int i= row;i<=m-1;i++){
                curr = mat[i][n-1];
                mat[i][n-1] = prev;
                prev = curr;
            }
            n--;

            if(col<n){
              for(int i=n-1;i>=col;i--){
                  curr = mat[m-1][i];
                  mat[m-1][i] = prev;
                  prev = curr;
              }
              m--;
            }
            if(row<m){
                for(int i=m-1;i>=row;i--){
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
                col++;
            }

        }
    }
}
