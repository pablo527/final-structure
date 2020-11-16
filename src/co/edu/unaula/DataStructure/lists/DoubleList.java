package co.edu.unaula.DataStructure.lists;
import co.edu.unaula.DataStructure.nodes.NodeDouble;

public class DoubleList {
    private NodeDouble tail;
    private NodeDouble head;
    private NodeDouble newNode;
    private int size;

    public DoubleList() {
        tail = null;
        head = null;
        size = 0;
    }
    private boolean isEmpty(){
        return (size == 0);
    }

    public void addFirst(Object data) {
        try {
            newNode = new NodeDouble(data);
            if (isEmpty()) {
                head = newNode;
            } else {
                newNode.setNextElement(tail);
                tail.setPreviousElement(newNode);
            }
            tail = newNode;
            size++;
        } catch (Exception ex) {
            throw ex;
        }
    }


    public NodeDouble deleteNode() {
        System.out.println("is emty");
       return null;
    }

    public void printTail() {
        try {
            if (!isEmpty()){
                NodeDouble current = tail;
                String text;
                while (current != null) {
                    int sizeString[] = new int[2];

                    text = "Previous Element ";
                    if (current.getPreviousElement() == null) {
                        text = text + " null";
                    } else {
                        sizeString[0] = current.getPreviousElement().toString().length();
                        text = text + current.getPreviousElement().getData().toString() + "---> Previus " +
                                "Node" + current.getPreviousElement().toString().substring(48, sizeString[0]);
                    }
                    text = text + "\r\nData " + current.getData().toString() + "\r\nNext Element ";

                    if (current.getNextElement() == null) {
                        text = text + "null";
                    } else {
                        sizeString[1] = current.getNextElement().toString().length();
                        text = text + current.getNextElement().getData().toString() + "---> Next " +
                                "Node" + current.getNextElement().toString().substring(48, sizeString[1]);
                    }
                    System.out.println(text + "\r\n");
                    current = current.getNextElement();
                }
            } else {
                System.out.println("the list is empty");
            }

        } catch (Exception ex) {
            throw ex;
        }
    }
    public void printHead(){
        try {
            if (!isEmpty()){
                NodeDouble current = head;
                String text;
                while (current != null) {
                    int sizeString[] = new int[2];

                    text = "Previous Element ";
                    if (current.getNextElement() == null) {
                        text = text + " null";
                    } else {
                        sizeString[0] = current.getNextElement().toString().length();
                        text = text + current.getNextElement().getData().toString() + "---> Previus " +
                                "Node" + current.getNextElement().toString().substring(48, sizeString[0]);
                    }
                    text = text + "\r\nData " + current.getData().toString() + "\r\nNext Element ";

                    if (current.getPreviousElement() == null) {
                        text = text + "null";
                    } else {
                        sizeString[1] = current.getPreviousElement().toString().length();
                        text = text + current.getPreviousElement().getData().toString() + "---> Next " +
                                "Node" + current.getPreviousElement().toString().substring(48, sizeString[1]);
                    }
                    System.out.println(text + "\r\n");
                    current = current.getPreviousElement();
                }
            } else {
                System.out.println("the list is empty");
            }

        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean validateSize(){
        if(size == 1){
            System.out.println("The last node is: " + tail.getData());
            return true;
        }
        return false;
    }
}