class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1|| nums.length==0){
            return nums.length;
        }
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],i);

        }
        int maxcount=0;
        for(Integer x : h1.keySet()){
            if(h1.containsKey(x-1)) continue;
            int count=1;
            while(h1.containsKey(x+1)){
                count++;
                x= x+1;
                
            }
            if(count>maxcount){
                    maxcount = count;
                }
        }
        return maxcount;
    }
}
