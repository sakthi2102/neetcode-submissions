class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> values = new HashMap<>();
        for(String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!values.containsKey(key))
            {
                values.put(key, new ArrayList<>());
            }
            values.get(key).add(word);
        }
        return new ArrayList<>(values.values());
    }
}
