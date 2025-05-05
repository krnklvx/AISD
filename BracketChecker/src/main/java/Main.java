import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("() " + isValid("()"));      // true
        System.out.println("()[]{} " + isValid("()[]{}")); // true
        System.out.println("(] " + isValid("(]"));     // false
        System.out.println("([)] " + isValid("([)]"));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char currentBracket: s.toCharArray()){
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{'){
                stack.push(currentBracket);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char lastLeftBracket = stack.pop();
                if (currentBracket == ')' && lastLeftBracket != '('){
                    return false;
                }
                if (currentBracket == ']' && lastLeftBracket != '['){
                    return false;
                }
                if (currentBracket == '}' && lastLeftBracket != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


