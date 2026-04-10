class Solution {
    public boolean cmp(int[]arr1,int[]arr2){
       

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length()>s2.length()){
            return false;
        }
        if(s1==s2) return true;
    int[] arr = new int[26];
    for(char c : s1.toCharArray()){
        arr[c-'a']++;

    }

    int length= s1.length();
    int[] arr2 = new int[26];
    int i;
    for( i=0;i<length;i++){
         arr2[s2.charAt(i)-'a']++;

    }int j = s1.length();
    int gg=0;

    while(j<s2.length() && !cmp(arr,arr2)  ){
        
              arr2[s2.charAt(gg)-'a']--;
              arr2[s2.charAt(j)-'a']++;
              gg++;

              j++;




    }
    return cmp(arr,arr2);

    }
}
