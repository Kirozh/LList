public class DoublyLinkedList {
    private Node first;//ссылка на первый элемент
    private Node last;//ccылка на последний элемент

    public DoublyLinkedList(){
        first=null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Node newNode =  new Node(id,dd);
        if (isEmpty())
            last = newNode;
        else
            first.previous = newNode;
        newNode.next = first;
        first = newNode;

    }

    public void insertLast(int id, double dd){
        Node newNode =  new Node(id,dd);
        if (isEmpty())
            first = newNode;
        else{
            last.next = newNode;
            newNode.previous = last;}
        last = newNode;
    }

    public Node deleteFirst(){
        Node newNode;
        newNode = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return newNode;
    }

    public Node deleteLast(){
        Node newNode;
        newNode = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return newNode;
    }

    public boolean insertAfter(int key, int id, double dd){
        Node current = first;
        while (current != null && current.iData != key){
            current = current.next;

        }
        if (current == null)
            return false;

        Node newNode = new Node(id,dd);

        if (current == last){
            newNode.next = null;
            last = newNode;

        }
            else{
                newNode.next = current.next;
                current.next.previous = newNode;
            }
        newNode.previous = current;
            current.next = newNode;
            return true;
    }

    public Node deleteKey(int key){
        Node current = first;
        while (current.iData != key){
            current = current.next;
            if (current == null)
                return null;
        }

        if (current == first)
            first = current.next;
         else
             current.previous.next = current.next;

        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward(){
        System.out.println("List: first --> last");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }

    }

    public void displayBackward(){
        System.out.println("List: last --> first");
        Node current = last;
        while (current != null){
            current.displayNode();
            current = current.previous;
        }

    }
}
