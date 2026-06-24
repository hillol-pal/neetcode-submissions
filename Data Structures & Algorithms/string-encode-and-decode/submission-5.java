class Solution {

    char delim = 267;
    char delimBlankString = 268;

    public String encode(List<String> strs) {
      StringBuffer encodedBuffer = new StringBuffer();
      if(strs==null)
        return encodedBuffer.append("").append(delim).toString();
      for(String str:strs){
        
        if(!str.isEmpty()){
            encodedBuffer.append(str).append(delim);
        }else{
            encodedBuffer.append("").append(delimBlankString).append(delim);
        }
      }

      System.out.println(encodedBuffer.toString());

      return encodedBuffer.toString();
        

    }

    public List<String> decode(String str) {

       ArrayList<String> result = new ArrayList<String>();

       String[] strs = str.split(Character.toString(delim));

       for(String st:strs){
          if(Character.toString(delimBlankString).equals(st)){
            result.add("");
          }else if(st.isEmpty()){
            continue;
          
          }else if(st.isBlank()){
            result.add(st);
          }else{
            result.add(st);
          }
            
            
       }

       return result;

    }
}
