class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val unique = HashSet<Int>()

        nums.forEach { num ->
            if (unique.contains(num)) {
                return true
            }
            unique.add(num)
        }

        return false
    }
}
