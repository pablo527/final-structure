package co.edu.unaula.DataStructure.lists;

import co.edu.unaula.DataStructure.nodes.Node;
import co.edu.unaula.DataStructure.nodes.NodeDouble;

public class CircularList {

    NodeDouble firstNode;
    NodeDouble lastNode;
    NodeDouble newNode;
    private NodeDouble deletedNode;
    int size;

    public  CircularList() {
        this.firstNode = null;
        this.lastNode = null;
        this.newNode = null;
        this.deletedNode = null;
        this.size = 0;
    }

    private boolean isEmpty(){
        return size == 0;
    }
    public CircularList addNode(Object data){
        newNode = new NodeDouble(data);
        if (isEmpty()){
            firstNode = newNode;
        } else {
            lastNode.setNextElement(newNode);
            newNode.setPreviousElement(lastNode);
        }

        lastNode = newNode;
        lastNode.setNextElement(firstNode);
        firstNode.setPreviousElement(lastNode);
        size ++;
        return this;
    }
    public NodeDouble deleteNode() {
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
            NodeDouble current = firstNode;
            while(current.getNextElement() != lastNode){
                current = current.getNextElement();
            }
            current.setNextElement(null);
            lastNode = current;
            lastNode.setNextElement(firstNode);
            return deletedNode;

        }

    }

    public void printNodesFirst(){

        NodeDouble current = firstNode;
        if (!isEmpty()){
            for (int i = 0; i < size; i++){
                System.out.println( current.getPreviousElement() + " -> " + current.getData() + "  -> " + current.getNextElement());
                current = current.getNextElement();
            }
        } else {
            System.out.println("the list is empty");
        }
    }
    public void printNodesLast(){

        NodeDouble current = lastNode;
        if (!isEmpty()){
            for (int i = 0; i < size; i++){
                System.out.println( current.getNextElement() + " -> " + current.getData() + "  -> " + current.getPreviousElement());
                current = current.getPreviousElement();
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
