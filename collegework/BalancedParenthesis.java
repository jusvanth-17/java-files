import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{')
              st.push('}');
            else if(s.charAt(i)=='[')
              st.push(']');
            else if(s.charAt(i)=='(')
              st.push(')');
            else if(st.isEmpty()){
                System.out.println("Not Balanced");
                System.exit(0);
            }
            else
               if(!st.isEmpty()&&st.peek()==s.charAt(i))
                  st.pop();
        }
        if(st.isEmpty())
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");

        }
        
    }
    
}
