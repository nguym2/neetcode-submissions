class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const unique = new Set<number>();

        for (const num of nums) {
            if (unique.has(num)) {
                return true;
            }
            unique.add(num);
        }

        return false;
    }
}
