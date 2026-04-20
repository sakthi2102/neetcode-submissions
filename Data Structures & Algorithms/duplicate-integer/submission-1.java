class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicated = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
           if(duplicated.contains(nums[i])) return true;
           duplicated.add(nums[i]);
        }
        return false;
    }
}