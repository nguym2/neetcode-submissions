class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const map = new Map();

        for (let i = 0; i < nums.length; i++) {
            const value = nums[i];
            const diff = target - value;

            if (map.has(diff)) {
                return [map.get(diff), i]
            }

            map.set(value, i)
        }

        return []
    }
}
