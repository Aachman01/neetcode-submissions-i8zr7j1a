class Solution {
    public int[] productExceptSelf(int[] nums) {
     long[] leftproduct = new long[nums.length];
     long[] rightproduct= new long[nums.length];
     long leftpro=(long)1;
    
     long rightpro=(long)1;
     for(int i=nums.length-1;i>=0;i--){
           rightproduct[i]= rightpro;
           rightpro *= nums[i];
     }
     
     for(int i=0;i<nums.length;i++){
        int temp = nums[i];
        nums[i] = (int)leftpro*(int)rightproduct[i];
        leftpro *=temp;

     }
     return nums;
    }
}  
