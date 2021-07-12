public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int[] arr=new int[2];
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1;j<nums.length; j++ ){
                    if(nums[i]+nums[j]==target){
                        arr[0]=i;
                        arr[1]=j;
                        return arr;
                    }
                }
            }
            return arr;
        }

        public static void main(String[]args) {
            int arr[]={3,2,4};
            int target=6;
            TwoSum num = new TwoSum();
           int ans[]= num.twoSum(arr,target);
           System.out.println(ans[0]);
           System.out.println(ans[1]);

        }
    
}
/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up 
 to target*/
