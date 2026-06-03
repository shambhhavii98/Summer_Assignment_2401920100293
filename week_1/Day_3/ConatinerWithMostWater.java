class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int Maxwater=0;
       while(left<right){
        if(height[left]<height[right]){
           int water=height[left]*(right-left);
            if(water>Maxwater){
                Maxwater=water;
            }
            left++;
        }
        else{
          int water=height[right]*(right-left);
           if(water>Maxwater){
            Maxwater=water;
           }
            right--;
        }
       }
       return Maxwater; 
    }
}
