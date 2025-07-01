import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> bytecode = Arrays.asList(
            "iconst_5",  
            "iconst_3",  
            "iadd",     
            "print"     
        );

        new Main().execute(bytecode);
    }

    private Stack<Integer> stack = new Stack<>();

    public void execute(List<String> bytecode) {
        for (String instruction : bytecode) {
            switch (instruction) {
                case "iconst_0": stack.push(0); break;
                case "iconst_1": stack.push(1); break;
                case "iconst_2": stack.push(2); break;
                case "iconst_3": stack.push(3); break;
                case "iconst_4": stack.push(4); break;
                case "iconst_5": stack.push(5); break;

                case "iadd": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                    break;
                }

                case "isub": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                }

                case "imul": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a * b);
                    break;
                }

                case "idiv": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                    break;
                }

                case "print": {
                    System.out.println("Output: " + stack.pop());
                    break;
                }

                default:
                    throw new IllegalArgumentException("Unknown instruction: " + instruction);
            }
        }
    }
}
