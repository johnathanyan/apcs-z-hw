public class MyStack {

	private String[] stack = new String[10];
    private int top;
    private int numElts;

    public MyStack(){
		top = 0;
		numElts = 0;
    }

    public  void push(String s){
	if (isEmpty()){
		stack[0] = s;
		numElts++;
	}
	else{
		String[] newStack = new String[stack.length + 1];
		for (int i = 0; i < stack.length; i++)
			newStack[i] = stack[i];
		numElts++;
		newStack[numElts - 1] = s;
		stack = newStack;
		top++;
	}
	}
	
    public String pop() {
	String s;
	s = stack[top];
	stack[top] = "";
	if (top != 0)
		top = top - 1;
	numElts = numElts - 1;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return numElts == 0;
    }

    public int getSize() {
	return numElts;
    }
    
    public String toString(){
	String ret = "";
    for (int x = top;x >= 0;x--){
        ret += stack[x] + ", ";
    }
    return ret;
    }
}
