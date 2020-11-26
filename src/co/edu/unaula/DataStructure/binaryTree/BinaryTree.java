package co.edu.unaula.DataStructure.binaryTree;

import co.edu.unaula.DataStructure.nodes.NodeTree;

public class BinaryTree {

    private NodeTree root;
    private String error;

    public BinaryTree(int root){
        this.root = new NodeTree(root);
    }

    public NodeTree getRoot() {
        return root;
    }

    public String getError() {
        return error;
    }

    private void addNodes(NodeTree newNode, NodeTree rootNode){
        try{

            newNode.setFather(rootNode);

            if(newNode.getValue() < rootNode.getValue()){

                if(rootNode.getLeftLeaf() == null){
                    rootNode.setLeftLeaf(newNode);
                }
                else{
                    addNodes(newNode,rootNode.getLeftLeaf());
                }
            }
            else{

                if(rootNode.getRightLeaf() == null){
                    rootNode.setRightLeaf(newNode);
                }
                else{
                    addNodes(newNode,rootNode.getRightLeaf());
                }
            }
        }
        catch (Exception ex){
            throw ex;
        }
    }

    private NodeTree findNode(int value, NodeTree root){

        try {
            if(value == root.getValue()){
                return root;
            }
            else if(value < root.getValue()){

                if(root.getLeftLeaf() != null){
                    return findNode(value, root.getLeftLeaf());
                }
                else{
                    return null;
                }
            }
            else{
                if(root.getRightLeaf() != null){
                    return findNode(value, root.getRightLeaf());
                }
                else{
                    return null;
                }
            }
        }
        catch (Exception ex){
            throw ex;
        }

    }

    private boolean removeLeaves(NodeTree node){

        try {
            if(node.getLeftLeaf() != null || node.getRightLeaf() != null){
                error = "The sent node is not a leaf";
                return false;
            }

            NodeTree leftChild = node.getFather().getLeftLeaf();
            NodeTree rightChild = node.getFather().getRightLeaf();

            if(leftChild == node){
                node.getFather().setLeftLeaf(null);
                return true;
            }
            if(rightChild == node){
                node.getFather().setRightLeaf(null);
                return true;
            }
            return false;
        }
        catch (Exception ex){
            throw ex;
        }
    }

    private boolean removeBranchUniqueChild(NodeTree node){

        try {

            if(node.getLeftLeaf() == null && node.getRightLeaf() == null){
                error = "The sent node is a leaf";
                return false;
            }

            NodeTree leftChild = node.getFather().getLeftLeaf();
            NodeTree rightChild = node.getFather().getRightLeaf();
            NodeTree actualChild;

            if(node.getLeftLeaf() != null){
                actualChild = node.getLeftLeaf();
            }
            else{
                actualChild = node.getRightLeaf();
            }

            if(leftChild == node){
                node.getFather().setLeftLeaf(actualChild);
                actualChild.setFather(node.getFather());
                node.setRightLeaf(null);
                node.setLeftLeaf(null);
                return true;
            }

            if(rightChild == node){
                node.getFather().setRightLeaf(actualChild);
                actualChild.setFather(node.getFather());
                node.setRightLeaf(null);
                node.setLeftLeaf(null);
                return true;
            }
            return false;
        }
        catch (Exception ex){
            throw ex;
        }
    }

    private NodeTree walkRight(NodeTree node){
        try{

            if(node.getLeftLeaf() != null){
                return walkRight(node.getLeftLeaf());
            }
            return node;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    private boolean removeNodes(NodeTree nodeFind){
        try{
            boolean haveChildRight = nodeFind.getRightLeaf() != null;
            boolean haveChildLeft = nodeFind.getLeftLeaf() != null;

            if(!haveChildLeft && !haveChildRight){
                return removeLeaves(nodeFind);
            }
            if(!haveChildLeft || !haveChildRight){
                return removeBranchUniqueChild(nodeFind);
            }
            if(haveChildLeft && haveChildRight){
                return removeRootSubTree(nodeFind);
            }
            return false;

        }
        catch (Exception ex){
            throw  ex;
        }
    }

    private boolean removeRootSubTree(NodeTree node){
        try {

            NodeTree rightMostNode = walkRight(node.getRightLeaf());

            if(rightMostNode != null){

                node.setValue(rightMostNode.getValue());
                removeNodes(rightMostNode);
                return true;
            }
            error = "The sent node is not an root";
            return false;
        }
        catch (Exception ex){
            throw ex;
        }
    }

    private void printPreOrder(NodeTree root){

        try{

            System.out.println(root.getValue());

            if(root.getLeftLeaf() != null){
                printPreOrder(root.getLeftLeaf());
            }
            if(root.getRightLeaf() != null){
                printPreOrder(root.getRightLeaf());
            }

        }
        catch (Exception ex){
            throw ex;
        }
    }

    private void printInOrder(NodeTree root){
        try{

            if(root.getLeftLeaf() != null){
                printInOrder(root.getLeftLeaf());
            }
            System.out.println(root.getValue());

            if(root.getRightLeaf() != null){
                printInOrder(root.getRightLeaf());
            }

        }
        catch (Exception ex){
            throw  ex;
        }
    }

    private void printPostOrder(NodeTree root){
        try {

            if(root.getLeftLeaf() != null){
                printPostOrder(root.getLeftLeaf());
            }
            if(root.getRightLeaf() != null){
                printPostOrder(root.getRightLeaf());
            }
            System.out.println(root.getValue());

        }
        catch (Exception ex){
            throw  ex;
        }
    }

    public void addNode(int value){
        try {
            NodeTree newNode = new NodeTree(value);
            this.addNodes(newNode,this.root);
        }
        catch (Exception ex){
            throw ex;
        }

    }

    public boolean removeNodesWithValue(int value){
        try{

            if(this.root.getValue() == value){
                error = "The root node can't be deleted";
                return false;
            }

            NodeTree nodeFind = findNode(value,this.root);

            if(nodeFind == null){
                error = "The node with value: " + value + " does not exist";
                return false;
            }

            return removeNodes(nodeFind);

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void print(int opcPrint){

        try {
            switch (opcPrint){

                case 1:
                    printPreOrder(this.root);
                    break;
                case 2:
                    printInOrder(this.root);
                    break;
                case 3:
                    printPostOrder(this.root);
                    break;
                default:
                    System.out.println("The type of print does not exist");
                    break;
            }
        }
        catch (Exception ex){
            throw ex;
        }

    }
}
