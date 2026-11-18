class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(count>0)
                st.push(ch);
                count++;
            }
            else{
                count--;
                if(count>0){
                    st.push(ch);
                }
            }
        }
        String fin = "";
        for(char ch :st){
            fin = fin +ch;
        }
        return fin;
    }
}