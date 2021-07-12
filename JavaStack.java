import java.util.*;

public class JavaStack {
    public static void main(String[] argh) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext() ) {
            boolean result = true;
            Stack<String> stack = new Stack<String>();
            String input = sc.next();

            if(input.equals("exit")) {
                break;
            }
            char[] ar =input.toCharArray();
            
            // Complete the code
            for (int i = 0; i < input.length(); i++) {
                if (ar[i] == '(' || ar[i] == '{' || ar[i] == '[') {
                    stack.push(input);
                } else if (ar[i] == ')' || ar[i] == '}' || ar[i] == ']') {
                    if(stack.empty()){
                        result = false;
                        break;
                    }
                    else if (input == stack.peek()) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                } else {
                }
            }
            if(!stack.empty()){
                //System.out.println(stack.empty());
                result=false;
            }
            System.out.println(result);
            result =true;
        }
    }

}
