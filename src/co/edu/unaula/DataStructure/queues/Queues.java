package co.edu.unaula.DataStructure.queues;

import co.edu.unaula.DataStructure.nodes.Node;

public class Queues {

    public Queues() {
        this.firstNode = null ;
        this.lastNode = null;
        this.size = 0;
    }

    Node firstNode;
    Node lastNode;
    int size;

    private boolean isEmty(){
        return (firstNode == null);
    }

    public void  addToQueues(String data){
        Node newNode = new Node(data);
        if (isEmty()){
            firstNode = newNode;
        } else {
            lastNode.setNext(newNode);
        }
        lastNode = newNode;
        size ++;
    }
    public  void dequeue(){
        if(!isEmty()){
            Node deletedItem = firstNode;
            firstNode = firstNode.getNext();
            size --;
            System.out.println(" the element was deleted is: " + deletedItem.getData());
            return;
        }
        System.out.println("The queue is empty");
    }
    public  void printQueue(){
        if (!isEmty()){
            Node current = firstNode;
            for (int i = 0; i < size; i++){
                System.out.println(current.getData());
                current = current.getNext();
            }
            return;
        }
        System.out.println("The queue is empty");

    }
}
