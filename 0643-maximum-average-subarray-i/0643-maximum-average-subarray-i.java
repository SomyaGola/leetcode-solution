class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int sum =0;
        int max=0;
        for(int i=0;i<k;i++){
            sum += nums[i];
            max= sum;
        }
        for(int i=k;i<nums.length;i++){
            sum= sum-nums[left++];
            sum= sum+nums[i];
            max= Math.max(max,sum);
        }
        double avg = (double) max/k;
        return avg;

    }
}