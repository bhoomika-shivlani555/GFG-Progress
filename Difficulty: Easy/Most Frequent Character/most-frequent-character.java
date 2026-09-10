class Solution {
    public static char getMaxOccuringChar(String s) {
        int arr[]=new int[26];
        for(int x=0;x<s.length();x++)
        {
            arr[s.charAt(x)-'a']++;
        }
        int max=0;
        for(int x=0;x<arr.length;x++)
            if(arr[x]>arr[max])
                max=x;
                
        char c= (char)(max+(int)('a'));
        return c;
    }
}