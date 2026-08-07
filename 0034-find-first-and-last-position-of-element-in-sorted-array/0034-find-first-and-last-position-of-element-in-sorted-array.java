class Solution {
    public int[] searchRange(int[] nums, int target) {

       int []arr=new int[2];
       int lower=lower(nums,target);
       int upper=upper(nums,target);
       arr[0]=lower;
       arr[1]=upper;
       return arr;
}
int lower(int nums[],int k){
    int start=0;
    int end=nums.length-1;
    int ans=-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==k){
            ans=mid;
            end=mid-1;

        }
        else if(nums[mid]>k){
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    return ans;
}
int upper(int nums[],int k)
{
    int start=0;
    int end=nums.length-1;
    int ans=-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==k){
            ans=mid;
            start=mid+1;
        }else if(nums[mid]>k){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return ans;
}
}
