public class LinkListApp {
    public static void main(String[] args){
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.2);
        theList.insertFirst(33, 3.3);
        theList.insertFirst(44, 4.89);
        theList.displayList();
        while (!theList.isEmpty()){
            Node aLink = theList.deleteFirst();
            System.out.print("Deleted:");
            aLink.displayNode();
            System.out.println("");
        }
        theList.displayList();

        DoubleConnect theDCList = new DoubleConnect();
        theDCList.insertFirst(22, 2.2);
        theDCList.insertFirst(33, 3.3);
        theDCList.insertFirst(44, 4.89);

        theDCList.insertLast(22, 2.2);
        theDCList.insertLast(33, 3.3);
        theDCList.insertLast(44, 4.89);

        theDCList.displayList();
        while (!theDCList.isEmpty()){
            theDCList.deleteFirst();
            System.out.print("Deleted:");
            //aLink.displayNode();
            System.out.println("");
        }
        theDCList.displayList();

        //стэк
        NodeStack theNodeStack = new NodeStack();
        theNodeStack.push(20, 0.2);
        theNodeStack.push(30, 0.3);

        theNodeStack.displayStack();

        theNodeStack.push(40, 0.4);
        theNodeStack.push(50, 0.5);

        theNodeStack.displayStack();

        theNodeStack.pop();
        theNodeStack.pop();

        theNodeStack.displayStack();

        //очередь в виде списка с началом и концом

        NodeQueue theQueue = new NodeQueue();

        theQueue.insert(20, 0.2);
        theQueue.insert(40, 0.4);
        theQueue.displayQueue();

        theQueue.insert(60, 0.6);
        theQueue.insert(80, 0.8);
        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();
    }
}
