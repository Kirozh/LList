public class SortedList {
    private Node first;

    public SortedList(){
        first = null;
    }

    public SortedList(Node[] nodeArray){
        first = null;
        for (int j = 0; j< nodeArray.length; j++)
            insert(nodeArray[j]);
    }
    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(Node k){
        //Node newNode = new Node(id,dd);
        Node previous = null;
        Node current = first;

        while (current != null && k.iData > current.iData){
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = k;
        else
            previous.next = k;
        k.next = current;
    }
    public void insert(int id, double dd){
        Node newNode = new Node(id,dd);
        Node previous = null;
        Node current = first;

        while (current != null && id > current.iData){
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = newNode;
        else
            previous.next = newNode;
        newNode.next = current;
    }

    public Node remove(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List: first --> last");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}
