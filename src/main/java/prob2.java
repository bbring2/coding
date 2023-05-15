import java.util.Map;
import java.util.Stack;

public class prob2 {

    public static boolean isPair(String str) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
