class Solution {
    public int xorOperation(int n, int start) {
        int rev = start;
        for(int i=1;i<n;i++){
            rev= rev^(start+2*i);}
            return rev;
    }
}