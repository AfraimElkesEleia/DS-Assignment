public class LinkedList {
    Node first;
    public LinkedList(){
        first = null;
    }
   
   
    public void displayList(){
        Node current = first;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void insert(int data){
        Node newdata = new Node(data);
        if(first==null)
            first = newdata;
        else {
            Node current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newdata;
        }
    }
}
