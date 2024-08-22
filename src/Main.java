//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* int[] arr = new int[]{200, 600, 88};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionArray(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        /****************************************************************************************/
       /* Stack stack = new Stack(4);
        stack.push(500);
        stack.push(66);
        stack.push(10);
        stack.push(200);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/
        /****************************************************************************************/
        LinkedList list = new LinkedList();
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.insert(55);
        list.insert(66);
        list.insert(77);
        list.insert(88);
        list.insert(99);
        list.displayList();
        rotateLeft(list);
        list.displayList();
        rotateLeft(list);
        list.displayList();
    }

    public static void insertionArray(int[] arr, int length) {
        if (length - 1 < 0) return;
        int temp = arr[--length];
        insertionArray(arr, length);
        int i = length - 1;
        boolean flag = false;
        for (; i >= 0; i--) {
            if (arr[i] > temp) {
                arr[i + 1] = arr[i];
                flag = true;
            }
        }
        if (flag) {
            arr[i + 1] = temp;
        }
    }
    public static void rotateLeft(LinkedList list){
        if (list.first == null) return; // list is empty
        Node current = list.first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list.first;
        list.first = list.first.next;
        current.next.next = null;
    }
}
