//https://leetcode.com/problems/rotate-array/
class Solution {

    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                //find the next non zero element
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[j] != 0) {
                        //swap elements at i and j
                        int a = nums[i];
                        nums[i] = nums[j];
                        nums[j] = a;
                        break;
                    }
                }
            }
        }
    }
}
//O(n^2)

class Solution1 {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = -1; //Points to the last non zero element in the array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nonZeroPointer++;
                if(nonZeroPointer != i) { //This means that nonZeroPointer now points to a zero element
                    nums[nonZeroPointer] = nums[i]; //So swap the values
                    nums[i] = 0;
                }
            }
        }
    }
}
//O(n)
