// We will build stack that take priority for maximum number
public class Stack {
    int[] arr;
    int length;
    int top;

    public Stack(int length) {
        top = -1;
        this.length = length;
        arr = new int[length];
    }

    public void push(int item) {
        if(top==length){
            System.out.println("Stack is full");
            return;
        }
        if (top == -1) { // if stack is empty
            arr[++top] = item;
        } else {
            int j;
            for (j = top ; j >= 0; j--) {
                if (arr[j] > item) { // if item is smaller than element of array --> shift element right
                    arr[j + 1] = arr[j];
                }else
                    break;
            }
            arr[j + 1] = item;
            top++;
        }
    }
    public int pop() {
        if (top == -1) {
            return 0;
        }else {
            int item = arr[top--];
            return item;
        }
    }
    public int peek() {
        if (top == 0) {
            return 0;
        }else {
            return arr[top];
        }
    }
    public boolean isEmpty() {
        return top == -1 ;
    }

    public boolean isFull() {
        return top == length;
    }
}
