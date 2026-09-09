class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        if (s.length != t.length) {
            return false;
        }

        const charMap: Record<string, number> = {};

        for (let i = 0; i < s.length; i++) {
            charMap[s[i]] = (charMap[s[i]] ?? 0) + 1;
            charMap[t[i]] = (charMap[t[i]] ?? 0) - 1;
        }

        return Object.values(charMap).every((val) => val === 0);
    }
}
