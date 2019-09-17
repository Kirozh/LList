public class LinkListApp {
    public static void main(String[] args){
        LinkList theList = new LinkList();
        theList.insertLink(22, 2.2);
        theList.insertLink(33, 3.3);
        theList.insertLink(44, 4.89);
        theList.displayList();
        while (!theList.isEmpty()){
            Node aLink = theList.deleteFirst();
            System.out.print("Deleted:");
            aLink.displayNode();
            System.out.println("");
        }
        theList.displayList();
    }
}
