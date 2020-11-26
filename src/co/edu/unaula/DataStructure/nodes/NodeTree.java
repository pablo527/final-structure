package co.edu.unaula.DataStructure.nodes;

public class NodeTree {
    private int value;
    private NodeTree father;
    private NodeTree leftLeaf;
    private NodeTree rightLeaf;

    public NodeTree(int value){
        this.value = value;
        father = null;
        leftLeaf = null;
        rightLeaf = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeTree getFather() {
        return father;
    }

    public void setFather(NodeTree father) {
        this.father = father;
    }

    public NodeTree getLeftLeaf() {
        return leftLeaf;
    }

    public void setLeftLeaf(NodeTree leftLeaf) {
        this.leftLeaf = leftLeaf;
    }

    public NodeTree getRightLeaf() {
        return rightLeaf;
    }

    public void setRightLeaf(NodeTree rightLeaf) {
        this.rightLeaf = rightLeaf;
    }
}
