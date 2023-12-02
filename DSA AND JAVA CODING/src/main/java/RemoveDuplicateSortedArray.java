/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_] */

public class RemoveDuplicateSortedArray {
        public int removeDuplicates(int[] nums) {
            int[] removeDuplicateArray=new int[nums.length];
            int length=0;
            int index=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!= nums[i-1]){
                    length++;
                    removeDuplicateArray[index]= nums[i];
                    index++;
                }
            }
            return length;
        }

}
