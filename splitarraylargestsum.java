class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];


        }
        //binary search
        while(start<end){
            //try for potential answer
            int mid=start+(end-start)/2;
            //calculate how many pieces we can devide this in with this max sum
            int sum=0;
            int pieces=1;
            for (int num:nums){
                if(sum+num > mid){
                    //you cant add this in subarray,make new one
                    //say you add this  num in new subarray then sum=num
                    sum=num;
                    pieces++;
                } else {
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;

        
    }
}
