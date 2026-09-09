class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        const map = new Map<number, number>()

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
