public class DoubleConnect {//ссылка и на начало, и на конец
    private Node first;
    private Node last;//ссылка на последний элемент

    public DoubleConnect(){
        first = last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Node current = new Node(id,dd);
        if (isEmpty())
            last = current;
        current.next = first;
        first = current;

    }

    public void insertLast(int id, double dd){
        Node newNode = new Node(id,dd);
        if (isEmpty())
            first = newNode;
        else{
        last.next = newNode;
        last = newNode;
        }
    }
    public void deleteFirst(){
        if (!isEmpty())
        {

            first = first.next;

        }
    }
    public void displayList(){
        System.out.println("List first --> last");
        Node current = first;
        while(current!=null){
            current.displayNode();
            current=  current.next;
        }
    }
}
