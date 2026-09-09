class Solution {
    public int[] decrypt(int[] code, int k) {
        int n= code.length;
        int left=0, right=0;
       int[] a= new int[n];
       if(k==0){
        return a;
       } 
       if(k>0){
         left =1;
         right = k;
       }
       else if(k<0){
        left = n+k;
        right = n-1;
       }
       int sum=0;
       for(int i=left;i<=right;i++){
          sum+= code[i];
       }
          for(int j=0;j<n;j++){
            a[j]= sum;
            sum-=code[left];
            left = (left+1)%n;
            right= (right+1)%n;
            sum+=code[right];
          
       }
       return a;
    }
}