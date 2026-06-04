class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if((m*n)!=(r*c))return mat;
        int [][]output=new int[r][c];
        int output_r=0;
        int output_c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                output[output_r][output_c]=mat[i][j];
                output_c++;
                //if the column value reached then change the row and set the cols value to 0;
                if(output_c==c){
                    output_c=0;
                    output_r++;
                }
            }
        }
       return output; 
    }
}