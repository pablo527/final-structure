package co.edu.unaula.DataStructure.lists;

import co.edu.unaula.DataStructure.nodes.Node;

public class CircularList {

    public  CircularList() {
        this.firstNode = null;
        this.lastNode = null;
        this.newNode = null;
        this.deletedNode = null;
        this.size = 0;
    }

    Node firstNode;
    Node lastNode;
    Node newNode;
    private Node deletedNode;
    int size;

    private boolean isEmpty(){
        return size == 0;
    }
    public CircularList addNode(Object data){
        newNode = new Node(data);
        if (isEmpty()){
            firstNode = newNode;
        } else {
            lastNode.setNext(newNode);
        }

        lastNode = newNode;
        lastNode.setNext(firstNode);
        size ++;
        return this;
    }
    public Node deleteNode() {
        if (isEmpty()){
            System.out.println("The list is empty");
            return null;
        }
        deletedNode = lastNode;
        size --;
        if(firstNode ==lastNode ){
            firstNode = null;
            lastNode = null;
            return null;
        } else{
            Node current = firstNode;
            while(current.getNext() != lastNode){
                current = current.getNext();
            }
            current.setNext(null);
            lastNode = current;
            lastNode.setNext(firstNode);
            return deletedNode;

        }

    }

    public void printNodes(){

        Node current = firstNode;
        if (!isEmpty()){
            for (int i = 0; i < size; i++){
                System.out.println("Data -> " + current.getData() + " Prompter -> " + current.getNext() + " Data's Promter: " + current.getNext().getData());
                current = current.getNext();
            }
        } else {
            System.out.println("the list is empty");
        }
    }

    public boolean validateSize(){
        if(size == 1){
            System.out.println("The last node is: " + lastNode.getData());
            return true;
        }
        return false;
    }

}
