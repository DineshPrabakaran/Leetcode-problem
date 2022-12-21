class Solution {
    public void setZeroes(int[][] matrix) {
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                flag1 = true;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i] == 0){
                flag2 = true;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(flag2){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }
        if(flag1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
