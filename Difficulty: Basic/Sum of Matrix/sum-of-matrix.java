class Solution {
    public int sumOfMatrix(int[][] mat) {
        int sum=0;
        for(int x=0;x<mat.length;x++)
        {
            for(int y=0;y<mat[x].length;y++)
            {
                sum+=mat[x][y];
            }
        }
        return sum;
    }
}