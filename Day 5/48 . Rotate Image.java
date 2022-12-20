class Solution {
    public void rotate(int[][] matrix) {
        Collections.reverse(Arrays.asList(matrix));
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
