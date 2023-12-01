class DSA {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return new int[0];

    }

    public static void main(String args[]){
        int[] nums={1,3,5,7};
        int target=4;
        DSA s= new DSA();
        int[] result=s.twoSum(nums,target);
        if(result.length==2){
            System.out.println("result found"+result[0]+result[1]);
        }else{
            System.out.println("no result");
        }

    }
};
 