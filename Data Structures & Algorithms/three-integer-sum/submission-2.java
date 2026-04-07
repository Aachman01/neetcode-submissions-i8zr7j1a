class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l1 =  new ArrayList<>();
        
         int target =0;
        
         for(int i =0;i<nums.length;i++){
            if(i>0&& nums[i-1]==nums[i]){
continue;
            } 
             int pivot = nums[i];
            int l = i+1;
            int r= nums.length-1;
            while(l<r){
                if(pivot+nums[l]+nums[r]==target){
                  List <Integer> temp = new ArrayList<>();
                  temp.add(pivot);
                  temp.add(nums[l]);
                  temp.add(nums[r]);
                  l1.add(temp);
                  l++;
                  r--;
                     while (l < r && nums[l] == nums[l - 1]) l++; // Skip same left values
while (l < r && nums[r] == nums[r + 1]) r--; // Skip same right values
            
                }
                else if(pivot+nums[l]+nums[r]<target){
                    l++;
                }
                else{
                    r--;
                }
            }
             
         }
         return l1;
    }
}
