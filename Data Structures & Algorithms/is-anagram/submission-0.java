class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length())
           return false;
        
        
        for(int i=0;i< s.length();i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }

        for(int j=0;j<t.length();j++){

            if(map.get(t.charAt(j)) == null)
              return false;
            else if(map.get(t.charAt(j)) == 1){
                map.remove(t.charAt(j));
            }else{
                map.put(t.charAt(j),map.get(t.charAt(j)) - 1);
            }


        }

        if(map.isEmpty())
           return true;

        return false;
    }
}
