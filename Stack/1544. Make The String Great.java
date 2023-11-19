class Solution {
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<Character>();
            
            for(char ch : s.toCharArray()){
                if(!stack.isEmpty() && (stack.peek()== ch+32 || stack.peek()==ch-32)){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }

            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                char last = stack.pop();
                sb.append(last);
            }
            return sb.reverse().toString();
        }
}
