class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            val value = nums[i]
            val diff = target - value

            if (map.containsKey(diff)) {
                return intArrayOf(map[diff]!!, i)
            }

            map[value] = i
        }

        return intArrayOf()
    }
}
