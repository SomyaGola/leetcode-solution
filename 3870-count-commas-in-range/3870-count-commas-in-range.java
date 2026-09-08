class Solution {
    public int countCommas(int n) {
        int temp=n;
        int digit=0;
       while(n!=0){
           n= n/10;
           digit++;
       } 
       if(digit<4){
         return 0;
       }
       return temp - 999;
    }
}