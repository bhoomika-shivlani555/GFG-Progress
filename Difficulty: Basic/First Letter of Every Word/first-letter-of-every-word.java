class Solution {
    String firstAlphabet(String s) {
        StringTokenizer st=new StringTokenizer(s);
        String ns="";
        int c=st.countTokens();
        for(int x=0;x<c;x++)
        {
            String s1=st.nextToken();
            ns=ns+s1.charAt(0);
        }
        return ns;
    }
};