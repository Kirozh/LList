public class NodeQueue {
    private DoubleConnect  theList;

    public NodeQueue(){
        theList = new DoubleConnect();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void insert(int id, double dd){
        theList.insertLast(id,dd);
    }

    public void remove(){
        theList.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Queue: first --> last");
        theList.displayList();
    }
}
