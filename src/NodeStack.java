public class NodeStack {
    private LinkList theList;

    public NodeStack(){
        theList = new LinkList();
    }

    public void push(int id, double dd){
        theList.insertFirst(id,dd);
    }

    public void pop(){
        theList.deleteFirst();
    }

    public boolean isEmpty(){
        return (theList.isEmpty());
    }

    public void displayStack(){
        System.out.println("Stack: first --> last");
        theList.displayList();
    }
}
