class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
       ArrayList<Integer> list=new ArrayList<>();
       int min=arr[0],max=arr[0];
       for(int x=0;x<arr.length;x++)
       {
           if(arr[x]<min)
            min=arr[x];
            if(arr[x]>max)
            max=arr[x];
       }
       list.add(min);
       list.add(max);
       return list;
    }
}
