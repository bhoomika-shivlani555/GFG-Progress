class Solution {
    public String removeSpaces(String s) {
        StringTokenizer st=new StringTokenizer(s);
        StringBuilder ns=new StringBuilder();
        while(st.hasMoreTokens())
        {
            ns.append(st.nextToken());
        }
        return ns.toString();
    }
}