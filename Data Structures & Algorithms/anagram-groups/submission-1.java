class Solution {
    public String standardize(String  str){
            int [] freq = new int[26];
        for(int i=0;i<str.length();i++){
               freq[(str.charAt(i)-'a')]++;

        }
        String s = "";
        for(int i=0;i<26;i++ ){
               s += String.valueOf(freq[i])+"#";
        }
        return s;

    }
    HashMap<String,List<String>> h1 = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        for(int i =0;i<strs.length;i++){
            String sd = standardize(strs[i]);
            if(h1.containsKey(sd)){
            List<String> l1 =  h1.get(sd);
            l1.add(strs[i]);
            h1.put(sd,l1);

            }
            else{
              List<String> l1 = new ArrayList<>();
              l1.add(strs[i]);
              h1.put(sd,l1);
            }

        }
        return new ArrayList<>(h1.values());
    }
}
