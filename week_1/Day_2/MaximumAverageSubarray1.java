class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int i=0;
      int j=0;
      int sum=0;
      double maxavg=Integer.MIN_VALUE;
      while(j<nums.length){
        sum=sum+nums[j];
       double avg=(double)sum/(j-i+1);
        if(j-i+1<k){
            j++;
        }
        else if(j-i+1==k){
           maxavg=Math.max(avg,maxavg);
           sum=sum-nums[i];
           i++;
           j++; 
        }

      }
      return maxavg;  
    }
}
