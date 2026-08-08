class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            
            
             if(c==0){
                el=nums[i];
                c+=1;
            }
            else if(nums[i]==el) c++;
            else c--;
           

        }
        int count=0;
        for(int i=0;i<nums.length;i++){
 if(el==nums[i]){
    count++;
 }
        }
        if(count>((nums.length)/2)) return el;
        return 0;
    }
}