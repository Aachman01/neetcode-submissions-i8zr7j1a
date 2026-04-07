class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            if(h1.containsKey(target-nums[i])){
                int x= h1.get(target-nums[i]);
                int[] arr={x,i};
                return arr;
            }
            h1.put(nums[i],i);
        }
        int[] arr = {-1,-1};
        return arr;

       
    }
}
