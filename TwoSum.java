public class TwoSum {

    //Brute force
    //O(n^2) speed
    //O(2) space - always have 2 variables active i,j

    /*
    Takes array nums (unsorted) and will check each combination to check if
    two elements will == sum and return the two indexes in an int array
     */
    public int[] twoSum(int[] nums, int sum) {
        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == sum){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {1};
    }

    public static void main(String[] args){
        int[] nums = new int[] {1,6,7,3,5,8,12};

        TwoSum test = new TwoSum();
        int sum = 9;
        int[] ans = test.twoSum(nums,9);
        for(int i = 0; i<ans.length;i++){
            System.out.println(test.twoSum(nums,sum)[i]);
        }

    }
}
