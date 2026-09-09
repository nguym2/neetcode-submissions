class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
            charMap.put(t.charAt(i), charMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int i : charMap.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
