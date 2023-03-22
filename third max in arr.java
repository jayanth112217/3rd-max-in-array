class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int numsSize=nums.length;
          if(numsSize==2)
       return nums[numsSize-1];
       int count=0;
    for(int i=numsSize-1;i>=0;i--){
        if(i==0 && count<2)
           return nums[numsSize-1];
         if(i==0)
          return nums[0];
        if(count==2)
          return nums[i];
      if(nums[i]!=nums[i-1])
         count++;
    }
    return 0;
}
}