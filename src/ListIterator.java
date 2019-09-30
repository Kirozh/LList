public class ListIterator {
    private Node current;
    private Node previous;
    private LinkList ourList;

    public ListIterator(LinkList list){
        ourList = list;
        reset();
    }

    public void reset(){
        current = ourList.getFirst();
        previous = null;
    }

    public boolean atEnd(){//true если итератор на последнем элементе
        return (current.next == null);
    }

    public void nextNode(){//переход к след элементу
        previous = current;
        current = current.next;
    }

    public Node getCurrrent(){
        return current;
    }

    public void insertAfter(int id, long dd){
        Node newNode = new Node(id, dd);
        if (ourList.isEmpty()){
            ourList.setFirst(newNode);
            current = newNode;
        }
        else
        {
            newNode.next = current.next;
            current.next = newNode;
            nextNode();
        }

    }

    public void insertBefore(int id, long dd){
        Node newNode = new Node(id, dd);
        if (previous == null){
            newNode.next = ourList.getFirst();
            ourList.setFirst(newNode);
            reset();
        }
        else
        {
            newNode.next = previous.next;
            previous.next = newNode;
            current = newNode;
        }

    }
    public double deleteCurrent(){
        double value = current.dData;
        if (previous == null){
            ourList.setFirst(current.next);
            reset();
        }
        else
        {
            previous.next = current.next;
            if (atEnd())
                reset();
            else
                current = current.next;

        }
        return value;
    }
}
