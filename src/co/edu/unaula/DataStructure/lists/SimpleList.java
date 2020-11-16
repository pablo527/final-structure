package co.edu.unaula.DataStructure.lists;
import co.edu.unaula.DataStructure.nodes.Node;

public class SimpleList {
    public SimpleList(){
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    Node firstNode;
    Node lastNode;
    Node newNode;
    Node deletedNode;
    int size;


    private boolean isEmpty() {
        return size == 0;
    }

    public void addNode(Object data){
        newNode = new Node(data);
        if(firstNode == null && lastNode == null){
            firstNode = newNode;
        } else {
            lastNode.setNext(newNode);
        }
        lastNode = newNode;
        size ++;
    }

    public Node deleteNode(){

        if(!isEmpty()){

           deletedNode = lastNode;

            if(firstNode == lastNode){
                firstNode = null;
                lastNode = null;
                size --;
                return deletedNode;
            }

            Node current = firstNode;

            while (current.getNext() != lastNode){

                current = current.getNext();
            }
            current.setNext(null);
            lastNode = current;
            size --;
            return deletedNode;
        }
        System.out.println("The list is empty...");
        return null;
    }

    public boolean validateSize(){
        if(size == 1){
            System.out.println("The last node is: " + lastNode.getData());
            return true;
        }
        return false;
    }

    public void printList(){
        if(firstNode != null && lastNode != null){
            Node current;
            int sizeString;
            current = firstNode;
            System.out.println("The elements are:");

            for(int i=0 ; i<size; i++){
                if ( current.getNext() != null){
                    sizeString = current.getNext().toString().length();
                    System.out.println(current.getData() + "---> Next " +
                            "Node"+ current.getNext().toString().substring(38,sizeString) +  "\n" );
                }else{
                    System.out.println(current.getData() + "---> Next " + "null" +  "\n" );
                }
                current = current.getNext();
            }
        } else {
            System.out.println("the list is empty");
        }
    }
}
