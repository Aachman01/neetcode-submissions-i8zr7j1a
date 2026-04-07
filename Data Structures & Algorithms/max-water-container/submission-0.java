class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right= heights.length-1;
        int area =0;
     while(left<right){
        
       
        int minio = Math.min(heights[left],heights[right]);
        int larea = minio * (right-left);
        area = Math.max(area,larea);
        if(heights[left]<heights[right]){
            left++;
        }
        else{right--;}
     }
     return area;
    }
}
