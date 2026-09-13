class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int chk=1<<k;
        if((chk & n )==0)
            return false;
        else
            return true;
    }
}