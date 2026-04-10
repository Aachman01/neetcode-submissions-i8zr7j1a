class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
    
        for(int i=0;i<s.length();i++){
            int maxfreq=0;
            int[] arr= new int[26];
            for(int j =i;j<s.length();j++){
                arr[(s.charAt(j))-'A']++;
                   maxfreq=Math.max(maxfreq,arr[s.charAt(j)-'A']);
                 if((j-i+1-maxfreq)<=k){
                        maxlen= Math.max(maxlen,j-i+1);
                 }
                 else{
                    break;
                 }
            }
        }
        return maxlen;
    }
}
