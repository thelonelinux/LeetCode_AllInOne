import java.util.Stack;

public class ValidParenthesis {

    public static  boolean isValid(String s) {

        if(s.length()%2==1){
            return false;
        }
        if (s.length()==0){
            return true;
        }
        //Concept is there must be a pop when ( or { or [ char is found else it will never be a valid string.
        //Found after close observation
        Stack<Character> stack= new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='(' || c=='{' || c=='[' || stack.isEmpty()){
                stack.push(c);
            }
            if (c==')' || c=='}' || c==']'){
                char prevChar=stack.peek();
                boolean popHappened=false;

                if(prevChar =='('  && c==')'){
                    stack.pop();
                    popHappened=true;
                }
                if(prevChar=='{' && c=='}'){
                    stack.pop();
                    popHappened=true;
                }
                if (prevChar=='[' && c==']'){
                    stack.pop();
                    popHappened=true;
                }
                if(popHappened==false){
                    return false;
                }

            }
        }

        if(stack.isEmpty()){
            return  true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {

        String s = "([}}])"; //"()[]{}";
        System.out.println(isValid(s));
    }
}
