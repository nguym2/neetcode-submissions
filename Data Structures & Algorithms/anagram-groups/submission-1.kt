class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagrams = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val count = IntArray(26)

            for (c in str) {
                count[c - 'a']++
            }

            val key = count.joinToString(",")

            anagrams.getOrPut(key) { mutableListOf() }.add(str)
        }

        return anagrams.values.toList()
    }
}
