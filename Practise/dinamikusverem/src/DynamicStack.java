public class DynamicStack {

    private class Stack{
        int value;
        Stack previous = null;

        public Stack(int value, Stack previous) {
            this.value = value;
            this.previous = previous;
        }
    }
    private Stack tail = null;
    private Stack actualStack = null;
    private int size;

    public boolean isEmpty() {
        return tail == null;
    }

    public void push(int value) {
        Stack stack1 = new Stack (value, tail);
        actualStack = tail = stack1;
        size++;
    }

    public int pop() {
        int temp = actualStack.value;
        tail = tail.previous;
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        if (!isEmpty()) {
            StringBuilder temp = new StringBuilder();
            temp.append("[");
            actualStack = tail;
            while (actualStack.previous != null) {
                temp.append(actualStack.value).append(", ");
                actualStack = actualStack.previous;
            }
            temp.append(actualStack.value).append("]");
            return temp.toString();
        }
        return "";
    }
}

