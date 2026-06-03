class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
       int s=0;
       int f=0;
       while(f<n){
        if(nums[f]!=0){
            int temp=nums[s];
            nums[s]=nums[f];
            nums[f]=temp;
            s++;
            f++;
        }
        else if(nums[f]==0){
            f++;
           
        }
       

       } 
    }
}
