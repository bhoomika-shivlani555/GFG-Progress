class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,len=0;
        map.put(0,-1);
        for(int x=0;x<arr.length;x++)
        {
            sum=sum+arr[x];
            if(map.containsKey(sum))
                len=Math.max(len,x-map.get(sum));
            else
                map.put(sum,x);
        }
        return len;
    }
}