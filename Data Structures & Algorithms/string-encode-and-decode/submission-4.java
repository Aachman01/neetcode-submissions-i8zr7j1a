class Solution {

    public String encode(List<String> strs) {
        String ans="";
            for(String s :strs){
                 ans+= String.valueOf(s.length())+"#"+s;
            }
            return ans;
    }

    public List<String> decode(String str) {
        List<String> l1 = new ArrayList<>();
        String temp ="";
                 int i=0;
                   while(i<str.length()){   
                    int j=i;
                    while(str.charAt(j)!='#')j++;

                        int length = Integer.parseInt(str.substring(i,j));
                        String tempo= str.substring(j+1,j+length+1);
                           
                           l1.add(tempo);
                           i=j+length+1;

                       }
                      
                 
                 return l1;
    }
}
