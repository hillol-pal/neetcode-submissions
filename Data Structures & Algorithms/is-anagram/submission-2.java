class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length())
           return false;
        
        
        for(char c : s.toCharArray()){
           map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(char c: t.toCharArray()){
    
            if(map.get(c) == null)
              return false;
            int freq = map.get(c);

            if(freq ==1)
              map.remove(c);
            else
              map.put(c, freq - 1);

        }

        if(map.isEmpty())
          return true;

        return false;
    }
}
