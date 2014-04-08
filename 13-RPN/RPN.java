import java.util.Scanner;

public class RPN {

    private static int[] stack = new int[10];
    private static int top;
    private static int numElts;

    public RPN() {
        top = 0;
        numElts = 0;
    }

    public static void push(int s) {
        if (isEmpty()) {
            stack[0] = s;
            numElts++;
        } else {
            int[] newStack = new int[stack.length + 1];
            for (int i = 0; i < stack.length; i++)
                newStack[i] = stack[i];
            numElts++;
            newStack[numElts - 1] = s;
            stack = newStack;
            top++;
        }
    }

    public static int pop() {
        int s;
        s = stack[top];
        stack[top] = 0;
        if (top != 0)
            top = top - 1;
        numElts = numElts - 1;
        return s;
    }

    public static int peek() {
        return stack[top];
    }

    public static boolean isEmpty() {
        return numElts == 0;
    }

    public static int getSize() {
        return numElts;
    }

    public String toString() {
        String ret = "";
        for (int x = top; x >= 0; x--) {
            ret += stack[x] + ", ";
        }
        return ret;
    }

    public static void main(String[] args) {
        RPN test = new RPN();
		//continuously loop
        while (true) {
            System.out.println("Input: ");
            Scanner scanner = new Scanner(System. in );
            String in = scanner.next();
            if ( in .equals("+")) {
                int ret = pop() + pop();
                push(ret);
                System.out.println(test);
            } else if ( in .equals("-")) {
                int ret = pop() - pop();
                push(ret);
                System.out.println(test);
            } else if ( in .equals("/")) {
                int ret = pop() / pop();
                push(ret);
                System.out.println(test);
            } else if ( in .equals("*")) {
                int ret = pop() * pop();
                push(ret);
                System.out.println(test);
            } else {
                push(Integer.parseInt( in ));
                System.out.println(test);
            }
        }
    }
}