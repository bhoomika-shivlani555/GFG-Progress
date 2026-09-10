class Solution {
    public boolean isMaxHeap(int[] arr) {
        // int n=0;
        // if(arr.length%2==0)
        //     n=arr.length/2;
        // else
        //     n=arr.length/2-1;
        for(int x=0;x<arr.length/2;x++)
        {
            int left=x*2+1;
            int right=x*2+2;
            if(arr[x]<arr[left] || (right<arr.length &&arr[x]<arr[right]))
                return false;
        }
        return true;
    }
}