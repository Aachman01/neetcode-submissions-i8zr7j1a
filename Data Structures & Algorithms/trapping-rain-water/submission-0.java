class Solution {
    public int trap(int[] height) {
        int[] lmax= new int[height.length];
        int[] rmax= new int[height.length];
        int left=0;
        for(int i=0;i<height.length;i++){
            lmax[i]= left;
            left = Math.max(left,height[i]);

        }
        int right=0;
        for(int j =height.length-1;j>=0;j--){
            rmax[j]= right;
            right= Math.max(right,height[j]);
        }
        int water=0;
        for(int x =0;x<height.length;x++){
            int lim = Math.min(lmax[x],rmax[x]);
            water += Math.max(0,lim-height[x]);

        }
        return water;
    }
}
