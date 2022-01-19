//has reverse method using stack data structure
public class stackPractice {
    /*
     * overide stack class constructor by changing the stack to use char array
     * also changes size of stack to be equal to the parameter of function
     * overide push and pop method
     */
    class Stack {
        int size;
        int top;
        char[] a;

        public Stack(int n) {
            top = -1;
            size = n;
            a = new char[size];
        }

        boolean isEmpty() {
            return (top < 0);
        }

        //add element to the topmost of stack, pre-increment the 
        //stack as the value starts at -1.
        public boolean push(char c) {
            // stack overflow case handling
            if (top >= size) {
                return false;
            }
            a[++top] = c;
            return true;
        }

        //remove topmost element, post-decrement the stack.
        public char pop() {
            // stack underflow case handling
            if (top < 0) {
                return 0;
            }
            char x = a[top--];
            return x;
        }
    }

    // reverse string using stack
    public String reverse(String s) {
        int n = s.length();
        Stack strStack = new Stack(s.length());
        for (int i = 0; i < n; i++) {
            strStack.push(s.charAt(i));
        }

        String reversed = "";
        for (int i = 0; i < n; i++) {
            reversed += strStack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {
        stackPractice s = new stackPractice();
        String str = "hewlett-packard";
        System.out.println("reverse version of string " + str + " is:" + 
        s.reverse(str));
    }
}
