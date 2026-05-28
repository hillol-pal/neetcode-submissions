class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisChecker = new Stack<>();

        if(s.length()==1)
           return false;

        for(char c: s.toCharArray()){

            if(c=='(' || c=='{' || c=='[')
                parenthesisChecker.push(c);
            else if(c==')' || c=='}' || c==']'){
                if(parenthesisChecker.isEmpty())
                  return false;
                char top = parenthesisChecker.peek();

                if(c==')' && top!='(' || c=='}' && top!='{' ||c==']' && top!='[')
                    return false;

                parenthesisChecker.pop();
            }

        }
        
        if(!parenthesisChecker.isEmpty())
           return false;
        
        return true;

    }
}
