class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const anagrams = new Map();

        for (const str of strs) {
            const count = new Array(26).fill(0);

            for (const c of str) {
                count[c.charCodeAt(0) - "a".charCodeAt(0)]++;
            }

            const key = count.join(",");

            if (!anagrams.has(key)) {
                anagrams.set(key, []);
            }

            anagrams.get(key).push(str);
        }

        return Array.from(anagrams.values());
    }
}
