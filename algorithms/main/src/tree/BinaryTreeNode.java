package tree;

/*
 * @desc
 * @author lirb
 * @datetime 2017/12/30,17:00
 */
public class BinaryTreeNode {
    private BinaryTreeNode leftNode;

    private BinaryTreeNode rightNode;

    private String value;

    public BinaryTreeNode(String value){
        this.value = value;
    }

    public BinaryTreeNode(BinaryTreeNode leftNode, BinaryTreeNode rightNode, String value){
        this(value);
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }


    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }


    public String getValue(){
        return  this.value;
    }
}
