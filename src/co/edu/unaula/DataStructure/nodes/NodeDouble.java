package co.edu.unaula.DataStructure.nodes;

public class NodeDouble{
    private  NodeDouble previousElement;
    private  Object data;
    private  NodeDouble NextElement;

    public NodeDouble(Object data) {
        this.previousElement = null;
        this.data = data;
        this.NextElement = null;
    }
    public NodeDouble getPreviousElement() {
        return previousElement;
    }
    public void setPreviousElement(NodeDouble previousElement) {
        this.previousElement = previousElement;
    }
    public Object getData() {
        return data;
    }
    public NodeDouble getNextElement() {
        return NextElement;
    }
    public void setNextElement(NodeDouble nextElement) {
        NextElement = nextElement;
    }
}
