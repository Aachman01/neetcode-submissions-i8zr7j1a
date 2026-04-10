class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int count =0;
        int maxcount=0;
        HashSet<Character> h1 = new HashSet<>();

        while(j<s.length()){
             if(!h1.contains(s.charAt(j))){
                count++;
                  h1.add(s.charAt(j));
                j++;
               maxcount= Math.max(count,maxcount);
             

             }
             else{
                while(h1.contains(s.charAt(j))){
                    h1.remove(s.charAt(i));
                    i++;
                    count--;

                }
             }
        }
        return maxcount;
    }
}
