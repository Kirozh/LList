public class LinkList {
    private Node first;
    public void LinList(){
        first = null;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int id, double dd){
        Node newLink = new Node(id,dd);
        newLink.next = first;
        first = newLink;
    }

    public Node find(int key){
        Node current = first;
        while (current != null && current.iData != key ){
            current = current.next;

        }
        if (current == null)
            return null;
        else
            return current;
    }

    public Node delete(int key){
        Node current = first;
        Node previous = first;
        while (current.iData != key){
            if (current == null)
                return null;
            else{
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public Node deleteFirst(){
        Node newLink = first;
        first = first.next;
        return newLink;
    }

    public Node getFirst(){

        return first;
    }

    public void setFirst(Node f){
        first = f;
    }
    public void displayList(){

        System.out.println("List : first --> last");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
