package co.edu.unaula.DataStructure.nodes;

public class Node {
    Object data;
    Node  next;
    public Node(Object data){
        this.data = data;
        next = null;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

