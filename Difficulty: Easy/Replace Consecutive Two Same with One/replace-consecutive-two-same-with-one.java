class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ns=new StringBuilder();
        ns.append(s.charAt(0));
        for(int x=1;x<s.length();x++)
        {
            char c1=s.charAt(x);
            char c2=s.charAt(x-1);
            if(c1!=c2)
            {
                ns.append(c1);
            }
        }
        return ns.toString();
    }
}