public class ListInsertionSortApp {

    public ListInsertionSortApp(){

    }

    public void ListInsertionSort() {
        int size = 10;
        Node[] nodeArray = new Node[10];

        for (int j = 0; j < size; j++) {
            int n = (int) (java.lang.Math.random() * 99);
            Node newNode = new Node(n, 0.1);
            nodeArray[j] = newNode;

        }

        System.out.println("Unsorted array: ");
        for (int j =0 ; j< size;j++)
            System.out.println(nodeArray[j].iData + " " + nodeArray[j].dData );

        SortedList theSortedList = new SortedList(nodeArray);
        for (int j =0; j< size; j++){
            nodeArray[j] = theSortedList.remove();
        }

        System.out.println("Sorted list");

        for (int j = 0; j< size; j++)
            System.out.println(nodeArray[j].iData + " " + nodeArray[j].dData);


    }
}
