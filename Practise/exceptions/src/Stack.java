import java.util.Arrays;

public class Stack {
    public String[] stackArray;
    public int counter;

    public Stack(int n){
        this.stackArray = new String[n];
        this.counter = 0;

    }
    public void push (String input) throws OneException{
        counter++;
        stackArray[counter]=input;
        if (counter > stackArray.length) {
            throw new OneException("stack is full");
        }
    }

    public String pop() throws OneException{
        if (counter == 0) {
            throw new OneException("this stack is empty");
        }
        counter--;
        return stackArray[counter + 1];
    }
    public boolean search(String something){
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray.equals(something)){
                System.out.println("itt van");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                ", counter=" + counter +
                '}';
    }
}
