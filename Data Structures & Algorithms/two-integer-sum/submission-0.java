class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int diff = target - value;

            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }

            map.put(value, i);
        }

        return new int[] {};
    }
}
