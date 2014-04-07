//added wrong homework - will update at home

public class MyStack {
    private int top;
    private int size;
    private String[] stack = new String[10];
    
    public MyStack() {
        top = stack.length - 1;
    }

    public void push(String s) {
        if (stack[top] == null) {
            stack[top] = s;
            size++;
        }
        else {
            if (top == 0) {
                expand();
            }
            stack[--top] = s;
            size++;
        }
    }

    public String pop() {
        String tmp = stack[top];
        stack[top] = null;
        if (top != stack.length - 1) {
            top++;
        }
        size--;
        return tmp;
    }

    public String peek() {
        return stack[top];
    }

}
