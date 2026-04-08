class Solution {
    public int[] productExceptSelf(int[] nums) {
     long[] leftproduct = new long[nums.length];
     long[] rightproduct= new long[nums.length];
     long leftpro=(long)1;
     for(int i=0 ;i<nums.length;i++){
        leftproduct[i]= leftpro;
        leftpro *= nums[i];

     }
     long rightpro=(long)1;
     for(int i=nums.length-1;i>=0;i--){
           rightproduct[i]= rightpro;
           rightpro *= nums[i];
     }
     for(int i=0;i<nums.length;i++){
        nums[i] = (int)leftproduct[i]*(int)rightproduct[i];

     }
     return nums;
    }
}  
