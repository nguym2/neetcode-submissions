class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val charMap = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            charMap[s[i]] = charMap.getOrDefault(s[i], 0) + 1
            charMap[t[i]] = charMap.getOrDefault(t[i], 0) - 1
        }

        return charMap.values.all { it == 0 }
    }
}
