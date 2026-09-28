class Solution {
    static int findFloor(int[] arr, int x) {
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]>x)
                r=mid-1;
            else
            {
                ans=mid;
                l=mid+1;
            }
                
        }
        return ans;
    }
}
