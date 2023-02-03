import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {

        String[] insert = {"4", "5", "+", "1", "2","*","-","5","/","end"};
        float totalValue = 0;

        // Initializing empty stack
        Stack<String> stack = new Stack();
        int i = 0;
        boolean b = stack.empty();
        while (true) {
            stack.push(insert[i]);
            System.out.println("\nTop:");
            System.out.println(insert[i]);
            i++;

            // perform addition if the stack is '+'
            if (stack.peek() == "+") {
                stack.pop();
                int number1 = Integer.parseInt((String) stack.pop());
                int number2 = Integer.parseInt((String) stack.pop());
                int value = number1 + number2;
                System.out.println("\nTop:");
                System.out.println(value);
                stack.push("" + value);
            }

            // perform multiplication if the stack is '-'
            if (stack.peek() == "*") {
                stack.pop();
                int num1 = Integer.parseInt((String) stack.pop());
                int num2 = Integer.parseInt((String) stack.pop());
                int val = num1 * num2;
                System.out.println("\nTop:");
                System.out.println(val);
                stack.push("" + val);
            }

            // perform subtraction if the stack is '-'
            if (stack.peek() == "-"){
                stack.pop();
                int numb1 = Integer.parseInt((String) stack.pop());
                int numb2 = Integer.parseInt((String) stack.pop());
                int v = numb2 - numb1;
                System.out.println("\nTop:");
                System.out.println(v);
                stack.push("" + v);
            }

            // perform division if the stack is '/'
            if (stack.peek() == "/"){
                stack.pop();
                int numb1 = Integer.parseInt((String) stack.pop());
                int numb2 = Integer.parseInt((String) stack.pop());

                totalValue = (float)numb2/numb1;
                System.out.println("\nTop:");
                System.out.println(totalValue);
                stack.push("" + totalValue);
            }

            // loop will break if the top of the stack is 'end'
            if(stack.peek() == "end"){
                break;
            }

        }
        System.out.println("\nFinal answer after calculating stacks: \n{(4+5)-(1*2)/5} is "+totalValue);
    }
}