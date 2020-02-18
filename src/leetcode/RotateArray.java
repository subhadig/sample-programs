//https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++) {
            int lastElement = nums[nums.length - 1];
            //Shift the elements to the right by one
            for(int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            //Store the previous last element as the new first element
            nums[0] = lastElement;
        }
    }
}
//O(n*k)
//Space = O(1)

class Solution1 {
    //nums = [1,2,3,4,5,6,7], k = 3
    public void rotate(int[] nums, int k) {
        k = k % nums.length; //to handle k > n cases
        reverse(nums, 0, nums.length - 1); //[7,6,5,4,3,2,1]
        reverse(nums, 0, k - 1); //[5,6,7,4,3,2,1]
        reverse(nums, k, nums.length - 1); //[5,6,7,1,2,3,4]
    }

    //[0,1,2,3,4], 1, 4 -> [0,3,2,1,4]
    private void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
//O(n)
//Space = O(1)

class Solution3 {
    //nums = [1,2,3,4,5,6,7], k = 3
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) {
            return;
        }
        k = k % nums.length; //to handle k > n cases
        int[] tempNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i < k) { //1, 2, 3 will be replaced by 5, 6, 7
                tempNums[i] = nums[i];
                nums[i] = nums[nums.length + i - k];
            } else if(i < nums.length - k) { //4 will be replaced by 1
                tempNums[i] = nums[i];
                nums[i] = tempNums[i - k];
            } else { //5, 6, 7 will be replaced by 1, 2, 3
                nums[i] = tempNums[i - k];
            }
        }
    }
}
//Time = O(n)
//Space = O(n)
