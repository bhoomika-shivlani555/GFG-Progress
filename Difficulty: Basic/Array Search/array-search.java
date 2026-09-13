class Solution {
    public int search(int arr[], int x) {
        for(int x1=0;x1<arr.length;x1++)
            if(arr[x1]==x)
                return x1;
        
        return -1;
    }
}
