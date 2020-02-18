//https://leetcode.com/problems/contains-duplicate/description/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int each : nums) {
            if(numSet.contains(each)) {
                return true;
            }
            numSet.add(each);
        }
        return false;
    }
}
//O(n)
