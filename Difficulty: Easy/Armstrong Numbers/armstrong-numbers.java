class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0;
        int n1=n;
        while(n!=0)
        {
            sum+=Math.pow(n%10,3);
            n=n/10;
        }
        return sum==n1;
    }
}