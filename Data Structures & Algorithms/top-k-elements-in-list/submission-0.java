class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i : nums){
            h1.put(i,(h1.getOrDefault(i,0))+1);
        }
        List<Integer>[] arr = new ArrayList[nums.length+1];
        for(int key :h1.keySet()){
            int value = h1.get(key);
            if(arr[value]==null){
                arr[value]= new ArrayList<>();
        


            }
            arr[value].add(key);
        }
  int[] result = new int[k];
  int count=0;
  for(int i =nums.length;i>=0 && count<k;i--){if(arr[i]!=null){
    for(int x: arr[i]){
        result[count++]= x;

    }
  }
 


  }
   return result;
    }
}
