package co.edu.unaula.DataStructure.stack;

import co.edu.unaula.DataStructure.nodes.Node;

public class StackSimpleList {
    public StackSimpleList() {
        this.topElement = null;
        this.size = 0;
    }
    Node topElement;
    int size;
    public boolean isEmpty(){
        return (topElement == null);
    }

    public void push (String data){
        Node newNode = new Node(data);
        if(!isEmpty()){
            newNode.setNext(topElement);
        }
        topElement = newNode;
        size++;
    }
    public  void pop(){
        if (!isEmpty()){
            Node deletedItem = topElement;
            topElement = topElement.getNext();
            System.out.println("the deleted item was: " + deletedItem.getData());
            size --;
            return;
        }
        System.out.println("The stack is empty");
    }
    public void printStack(){
        if (!isEmpty()){
            Node current = topElement;
            System.out.println("Elements of Stack: ");
            for (int i= 0; i< size; i++){
                System.out.println(current.getData());

                current = current.getNext();
            }
            return;
        }
        System.out.println("The stack is empty");
    }
    public boolean validateSize(){
        if(size == 1){
            System.out.println("The last node is: " + topElement.getData());
            return true;
        }
        return false;
    }
}
