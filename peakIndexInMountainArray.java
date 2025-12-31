class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasesing part of array
                end=mid;
            }
            else{
                //you are in assesing part of array
                start=mid+1; //we know mid+1 ele is greaterv then misd element 

            }
            //in the ened start==ened pointing the largest eklement beacause of two checks abob=ve
            //start end try to find max ele in the two abovw case
            //hence they are pointing to  just one element thatt is max beacuse whwt we check say
            //in evcery point of start and end they have hga==have the best posssible amswer tilll that time if we are saying only one item is remaining because of above line that is most suitable answer
            
        }
        return start;
    }
}
