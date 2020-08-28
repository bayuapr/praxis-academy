public class Stack {
    private String[] stack;
    private int max;
    private int top;

    public Stack(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public void push(String value) {
        stack[++top] = value;
    }

   public String pop() {
      return stack[top - ];
   }

    public String peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        // push data
        s.push("FISIKA");
        s.push("KIMIA");
        s.push("MATEMATIKA");
        s.peek(); // MATEMATIKA
        s.push("B. INDONESIA");
        s.push("BIOLOGI");
        s.isEmpty(); // false
        s.isFull(); // true
        s.pop(); // remove BIOLOGI
        s.isFull(); // false
    }
}