class Solution {
    public int countZeros(int[][] mat) {
        int count=0;
        for(int x=0;x<mat.length;x++)
        {
            for(int y=0;y<mat[x].length;y++)
            {
                if(mat[x][y]==0)
                    count++;
            }
        }
        return count;
    }
};